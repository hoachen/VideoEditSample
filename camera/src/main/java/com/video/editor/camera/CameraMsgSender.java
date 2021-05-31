package com.video.editor.camera;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface CameraMsgSender {

    void sendRequestHighResPhoto();

    void sendFlashChange(boolean var1);

    void sendApplyAEPoint(float var1, float var2, int var3, int var4, boolean var5);

    void sendOpenCamera(@NonNull Facing var1, int var2, boolean var3);

    void sendReleaseCamera();

    void sendPause();

    void sendShutDown(@Nullable CameraMsgSender.ShutDownCallback var1);

    void sendChangeZoom(int var1);

    void sendTakeOriginalPhoto();

    void sendInitCameraMatrix(int var1, int var2);

    void sendMakeExt(boolean var1);

    void sendRecordStatus(boolean var1);

    void sendSetFpsMode(@NonNull CameraFpsMode var1);

    public interface ShutDownCallback {
        void done();
    }
}
