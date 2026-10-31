package p;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t2d extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ byte a;
    public final Object b;

    public t2d(List list) {
        this.a = (byte) 0;
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof u2d)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                break;
            case 1:
                hdd1 hdd1Var = (hdd1) obj;
                hdd1Var.k(cameraCaptureSession);
                hdd1Var.a(hdd1Var);
                break;
            default:
                super.onActive(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    no80.C((CameraCaptureSession.StateCallback) it.next(), cameraCaptureSession);
                }
                break;
            case 1:
                hdd1 hdd1Var = (hdd1) obj;
                hdd1Var.k(cameraCaptureSession);
                hdd1Var.b(hdd1Var);
                break;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                break;
            case 1:
                hdd1 hdd1Var = (hdd1) obj;
                hdd1Var.k(cameraCaptureSession);
                hdd1Var.c(hdd1Var);
                break;
            default:
                super.onClosed(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        mzc mzcVar;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((hdd1) this.b).k(cameraCaptureSession);
                    hdd1 hdd1Var = (hdd1) this.b;
                    hdd1Var.d(hdd1Var);
                    synchronized (((hdd1) this.b).a) {
                        o0c.p(((hdd1) this.b).i, "OpenCaptureSession completer should not null");
                        hdd1 hdd1Var2 = (hdd1) this.b;
                        mzcVar = hdd1Var2.i;
                        hdd1Var2.i = null;
                        break;
                    }
                    return;
                } finally {
                    synchronized (((hdd1) this.b).a) {
                        o0c.p(((hdd1) this.b).i, "OpenCaptureSession completer should not null");
                        hdd1 hdd1Var3 = (hdd1) this.b;
                        mzcVar = hdd1Var3.i;
                        hdd1Var3.i = null;
                        mzcVar.c(new IllegalStateException("onConfigureFailed"));
                    }
                }
            default:
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        mzc mzcVar;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((hdd1) this.b).k(cameraCaptureSession);
                    hdd1 hdd1Var = (hdd1) this.b;
                    hdd1Var.e(hdd1Var);
                    synchronized (((hdd1) this.b).a) {
                        o0c.p(((hdd1) this.b).i, "OpenCaptureSession completer should not null");
                        hdd1 hdd1Var2 = (hdd1) this.b;
                        mzcVar = hdd1Var2.i;
                        hdd1Var2.i = null;
                        break;
                    }
                    return;
                } finally {
                    synchronized (((hdd1) this.b).a) {
                        o0c.p(((hdd1) this.b).i, "OpenCaptureSession completer should not null");
                        hdd1 hdd1Var3 = (hdd1) this.b;
                        mzcVar = hdd1Var3.i;
                        hdd1Var3.i = null;
                        mzcVar.b((Object) null);
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ((q450) this.b).i = ImageWriter.newInstance(inputSurface, 1);
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                break;
            case 1:
                hdd1 hdd1Var = (hdd1) obj;
                hdd1Var.k(cameraCaptureSession);
                hdd1Var.f(hdd1Var);
                break;
            default:
                super.onReady(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                break;
            case 1:
                hdd1 hdd1Var = (hdd1) obj;
                hdd1Var.k(cameraCaptureSession);
                hdd1Var.h(hdd1Var, surface);
                break;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                break;
        }
    }

    private final void a(CameraCaptureSession cameraCaptureSession) {
    }

    public /* synthetic */ t2d(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
