package com.video.editor.camera;

import androidx.annotation.NonNull;

public interface ICameraThread {

    void shutdown(CameraMsgSender.ShutDownCallback callback);

    void handleMakeExt(boolean use);

    void handleRecordingStatus(boolean isRecordStatus);

    void handleOpenCamera(@NonNull Facing facing, int zoomProgress, boolean flashEnable);

    void handleReleaseCamera();

    void handlePaused();

    void handleChangeZoom(int zoom);

    void handleInitCameraMatrix(int var1, int var2);

    void handleTakeOriginalPhoto();

    void handleRequestHighResPhoto();

    void handleFlashEnable(boolean enable);

    void handleSetFpsMode(@NonNull CameraFpsMode mode);
}
