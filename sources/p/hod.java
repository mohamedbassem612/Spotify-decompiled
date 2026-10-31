package p;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hod extends edd1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public hod(List list, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.b = arrayList;
                arrayList.addAll(list);
                break;
            default:
                this.b = list.isEmpty() ? new u2d() : list.size() == 1 ? (CameraCaptureSession.StateCallback) list.get(0) : new t2d(list);
                break;
        }
    }

    @Override // p.edd1
    public void a(hdd1 hdd1Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((CameraCaptureSession.StateCallback) obj).onActive((CameraCaptureSession) ((q59) hdd1Var.r().b).b);
                break;
            case 2:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((edd1) it.next()).a(hdd1Var);
                }
                break;
        }
    }

    @Override // p.edd1
    public void b(hdd1 hdd1Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                no80.C((CameraCaptureSession.StateCallback) obj, (CameraCaptureSession) ((q59) hdd1Var.r().b).b);
                break;
            case 2:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((edd1) it.next()).b(hdd1Var);
                }
                break;
        }
    }

    @Override // p.edd1
    public void c(hdd1 hdd1Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((CameraCaptureSession.StateCallback) obj).onClosed((CameraCaptureSession) ((q59) hdd1Var.r().b).b);
                break;
            case 2:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((edd1) it.next()).c(hdd1Var);
                }
                break;
        }
    }

    @Override // p.edd1
    public final void d(hdd1 hdd1Var) {
        switch (this.a) {
            case 0:
                synchronized (((iod) this.b).a) {
                    try {
                        switch (l1d.C(((iod) this.b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: ".concat(l1d.G(((iod) this.b).i)));
                            case 3:
                            case 5:
                            case 6:
                                ((iod) this.b).d();
                                break;
                            case 7:
                                j2h1.o("CaptureSession");
                                break;
                        }
                        j2h1.p("CaptureSession");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onConfigureFailed((CameraCaptureSession) ((q59) hdd1Var.r().b).b);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((edd1) it.next()).d(hdd1Var);
                }
                return;
        }
    }

    @Override // p.edd1
    public final void e(hdd1 hdd1Var) {
        switch (this.a) {
            case 0:
                synchronized (((iod) this.b).a) {
                    try {
                        switch (l1d.C(((iod) this.b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: ".concat(l1d.G(((iod) this.b).i)));
                            case 3:
                                iod iodVar = (iod) this.b;
                                iodVar.i = 5;
                                iodVar.e = hdd1Var;
                                j2h1.o("CaptureSession");
                                iod iodVar2 = (iod) this.b;
                                iodVar2.j(iodVar2.f);
                                iod iodVar3 = (iod) this.b;
                                iodVar3.o.e().b(new fe(iodVar3, (byte) 19), n5u.a());
                                break;
                            case 5:
                                ((iod) this.b).e = hdd1Var;
                                break;
                            case 6:
                                hdd1Var.j();
                                break;
                        }
                        j2h1.o("CaptureSession");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onConfigured((CameraCaptureSession) ((q59) hdd1Var.r().b).b);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((edd1) it.next()).e(hdd1Var);
                }
                return;
        }
    }

    @Override // p.edd1
    public final void f(hdd1 hdd1Var) {
        switch (this.a) {
            case 0:
                synchronized (((iod) this.b).a) {
                    try {
                        if (l1d.C(((iod) this.b).i) == 0) {
                            throw new IllegalStateException("onReady() should not be possible in state: ".concat(l1d.G(((iod) this.b).i)));
                        }
                        j2h1.o("CaptureSession");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onReady((CameraCaptureSession) ((q59) hdd1Var.r().b).b);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((edd1) it.next()).f(hdd1Var);
                }
                return;
        }
    }

    @Override // p.edd1
    public final void g(hdd1 hdd1Var) {
        switch (this.a) {
            case 0:
                synchronized (((iod) this.b).a) {
                    try {
                        if (((iod) this.b).i == 1) {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: ".concat(l1d.G(((iod) this.b).i)));
                        }
                        j2h1.o("CaptureSession");
                        ((iod) this.b).d();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((edd1) it.next()).g(hdd1Var);
                }
                return;
        }
    }

    @Override // p.edd1
    public void h(hdd1 hdd1Var, Surface surface) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((CameraCaptureSession.StateCallback) obj).onSurfacePrepared((CameraCaptureSession) ((q59) hdd1Var.r().b).b, surface);
                break;
            case 2:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((edd1) it.next()).h(hdd1Var, surface);
                }
                break;
        }
    }

    private final void i(hdd1 hdd1Var) {
    }

    public hod(iod iodVar) {
        this.a = (byte) 0;
        this.b = iodVar;
    }
}
