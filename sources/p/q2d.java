package p;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q2d extends CameraCaptureSession.StateCallback {
    public final CameraCaptureSession.StateCallback a;
    public final Executor b;

    public q2d(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.b = executor;
        this.a = stateCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new p2d(this, cameraCaptureSession, (byte) 0));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new p2d(this, cameraCaptureSession, (byte) 2));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new p2d(this, cameraCaptureSession, (byte) 1));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new p2d(this, cameraCaptureSession, (byte) 5));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new p2d(this, cameraCaptureSession, (byte) 3));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new p2d(this, cameraCaptureSession, (byte) 4));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.b.execute(new c45((Object) this, (Object) cameraCaptureSession, (Object) surface, (byte) 4));
    }
}
