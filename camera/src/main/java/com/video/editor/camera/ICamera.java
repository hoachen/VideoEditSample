package com.video.editor.camera;

public interface ICamera {

    void onGLInit();

    void release();

    void requestHighResPhoto();

    void stopPreviewAndCloseCamera();

    void openCameraAndStartPreview(Facing facing, int zoomProgress, boolean flashEnable);

    void applyZoom(int zoomProgress);

    void takeOriginalPhoto();

    void setMakeExtCameraTexture(boolean use);

    void setFlashEnable(boolean enable);

    void setRecordingStatus(boolean recordingStatus);

    void setFpsMode(CameraFpsMode mode);
}
