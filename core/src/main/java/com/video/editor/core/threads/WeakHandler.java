package com.video.editor.core.threads;

import android.os.Handler;

import androidx.annotation.Nullable;

import java.lang.ref.WeakReference;

public class WeakHandler<WT extends BaseWorkThread> extends Handler {
    private WeakReference<WT> mWeakRenderThread;
    private static final int INTEGER_BITS_LENGTH = 32;
    private static final long INTEGER_BITS_MASK = 4294967295L;

    public WeakHandler(WT wt) {
        this.mWeakRenderThread = new WeakReference(wt);
    }

    @Nullable
    public BaseWorkThread getThread() {
        return (BaseWorkThread)mWeakRenderThread.get();
    }

    protected static int getIntForBoolean(boolean value) {
        return value ? 1 : 0;
    }

    protected static boolean getBooleanFromInt(int value) {
        return value > 0;
    }

    protected static int getLongHighBits(long value) {
        return (int)(value >> 32);
    }

    protected static int getLongLowBits(long value) {
        return (int)value;
    }

    protected static long getLongFromInts(int valueHigh, int valueLow) {
        return (long)valueHigh << 32 | (long)valueLow & 4294967295L;
    }
}
