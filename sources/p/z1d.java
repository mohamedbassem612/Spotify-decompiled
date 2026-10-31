package p;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z1d extends uq8 {
    public static final sy8 c = new sy8("camera2.captureRequest.templateType", Integer.TYPE, null);
    public static final sy8 d = new sy8("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);
    public static final sy8 e = new sy8("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
    public static final sy8 f = new sy8("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
    public static final sy8 g = new sy8("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
    public static final sy8 h = new sy8("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

    public static sy8 J(CaptureRequest.Key key) {
        return new sy8("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
