package p;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class p2d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q2d b;
    public final /* synthetic */ CameraCaptureSession c;

    public /* synthetic */ p2d(q2d q2dVar, CameraCaptureSession cameraCaptureSession, byte b) {
        this.a = b;
        this.b = q2dVar;
        this.c = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        CameraCaptureSession cameraCaptureSession = this.c;
        q2d q2dVar = this.b;
        switch (b) {
            case 0:
                q2dVar.a.onActive(cameraCaptureSession);
                break;
            case 1:
                q2dVar.a.onClosed(cameraCaptureSession);
                break;
            case 2:
                no80.C(q2dVar.a, cameraCaptureSession);
                break;
            case 3:
                q2dVar.a.onConfigured(cameraCaptureSession);
                break;
            case 4:
                q2dVar.a.onReady(cameraCaptureSession);
                break;
            default:
                q2dVar.a.onConfigureFailed(cameraCaptureSession);
                break;
        }
    }
}
