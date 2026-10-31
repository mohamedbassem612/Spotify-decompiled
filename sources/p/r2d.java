package p;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r2d extends q59 {
    public final int b(ArrayList arrayList, g661 g661Var, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) ((q59) this).b).captureBurstRequests(arrayList, g661Var, captureCallback);
    }

    public final int t(CaptureRequest captureRequest, g661 g661Var, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) ((q59) this).b).setSingleRepeatingRequest(captureRequest, g661Var, captureCallback);
    }
}
