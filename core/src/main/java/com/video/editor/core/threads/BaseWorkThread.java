package com.video.editor.core.threads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class BaseWorkThread<H extends Handler> extends Thread {

    private final Object mStartLock = new Object();
    protected H mHandler;
    protected volatile boolean mReady = false;

    public BaseWorkThread(String threadName) {
        super(threadName);
    }

    protected abstract H constructHandler();


    public void run() {
        Looper.prepare();
        this.mHandler = this.constructHandler();
        this.preRunInit();
        synchronized(this.mStartLock) {
            this.mReady = true;
            this.mStartLock.notify();
        }

        Looper.loop();
        this.postRunClear();
        synchronized(this.mStartLock) {
            this.mReady = false;
        }
    }

    protected void preRunInit() {
    }

    protected void postRunClear() {
    }

    @NonNull
    public H startAndGetHandler() {
        if (!this.mReady) {
            super.start();
            this.waitUntilReady();
        }

        return this.mHandler;
    }

    @Nullable
    public H getHandler() {
        return this.mHandler;
    }

    protected void releaseHandler() {
        this.mHandler = null;
    }

    protected void waitUntilReady() {
        synchronized(this.mStartLock) {
            while(!this.mReady) {
                try {
                    this.mStartLock.wait();
                } catch (InterruptedException var4) {
                    Log.w("BaseWorkThread", "waitUntilReady", var4);
                }
            }

        }
    }

    @CallSuper
    public void shutdown() {
        Looper looper = Looper.myLooper();
        if (looper != null) {
            looper.quit();
        }

    }
}
