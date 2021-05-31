package com.video.editor.camera;

import androidx.annotation.NonNull;

import com.video.editor.core.threads.BaseWorkThread;

public class CameraThread extends BaseWorkThread<CameraHandler> implements ICameraThread {

    public CameraThread(String threadName) {
        super(threadName);
    }

    @Override
    protected CameraHandler constructHandler() {
        return null;
    }

    @Override
    public void shutdown(CameraMsgSender.ShutDownCallback callback) {

    }

    @Override
    public void handleMakeExt(boolean use) {

    }

    @Override
    public void handleRecordingStatus(boolean isRecordStatus) {

    }

    @Override
    public void handleOpenCamera(@NonNull @org.jetbrains.annotations.NotNull Facing facing, int zoomProgress, boolean flashEnable) {

    }

    @Override
    public void handleReleaseCamera() {

    }

    @Override
    public void handlePaused() {

    }

    @Override
    public void handleChangeZoom(int zoom) {

    }

    @Override
    public void handleInitCameraMatrix(int var1, int var2) {

    }

    @Override
    public void handleTakeOriginalPhoto() {

    }

    @Override
    public void handleRequestHighResPhoto() {

    }

    @Override
    public void handleFlashEnable(boolean enable) {

    }

    @Override
    public void handleSetFpsMode(@NonNull @org.jetbrains.annotations.NotNull CameraFpsMode mode) {

    }
}
