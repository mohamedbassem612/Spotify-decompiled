package p;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qnd extends d2d {
    public final CameraCaptureSession.CaptureCallback a;

    public qnd(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.a = captureCallback;
        } else {
            bhn0.i("captureCallback is null");
            throw null;
        }
    }
}
