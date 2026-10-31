package p;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o1d extends CameraDevice.StateCallback {
    public final g661 a;
    public final js50 b;
    public n1d c;
    public ScheduledFuture d;
    public final m1d e;
    public final /* synthetic */ p1d f;

    public o1d(p1d p1dVar, g661 g661Var, js50 js50Var, long j) {
        this.f = p1dVar;
        this.a = g661Var;
        this.b = js50Var;
        m1d m1dVar = new m1d();
        m1dVar.c = this;
        m1dVar.b = -1L;
        m1dVar.a = j;
        this.e = m1dVar;
    }

    public final boolean a() {
        if (this.d == null) {
            return false;
        }
        this.f.t("Cancelling scheduled re-open: " + this.c);
        this.c.b = true;
        this.c = null;
        this.d.cancel(false);
        this.d = null;
        return true;
    }

    public final void b() {
        int iMin;
        o0c.q((String) null, this.c == null);
        o0c.q((String) null, this.d == null);
        long jUptimeMillis = SystemClock.uptimeMillis();
        m1d m1dVar = this.e;
        long j = m1dVar.b;
        if (j == -1) {
            m1dVar.b = jUptimeMillis;
            j = jUptimeMillis;
        }
        long j2 = jUptimeMillis - j;
        boolean zC = ((o1d) m1dVar.c).c();
        long j3 = m1dVar.a;
        if (zC) {
            iMin = 1800000;
            if (j3 > 0) {
                iMin = Math.min((int) j3, 1800000);
            }
        } else {
            iMin = 10000;
            if (j3 > 0) {
                iMin = Math.min((int) j3, 10000);
            }
        }
        long j4 = iMin;
        p1d p1dVar = this.f;
        if (j2 >= j4) {
            m1dVar.b = -1L;
            j2h1.p("Camera2CameraImpl");
            p1dVar.E(4, null, false);
            return;
        }
        this.c = new n1d(this, this.a);
        p1dVar.t("Attempting camera re-open in " + m1dVar.b() + "ms: " + this.c + " activeResuming = " + p1dVar.c1);
        this.d = this.b.schedule(this.c, (long) m1dVar.b(), TimeUnit.MILLISECONDS);
    }

    public final boolean c() {
        p1d p1dVar = this.f;
        if (!p1dVar.c1) {
            return false;
        }
        int i = p1dVar.X;
        return i == 1 || i == 2;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.f.t("CameraDevice.onClosed()");
        o0c.q("Unexpected onClose callback on camera device: " + cameraDevice, this.f.t == null);
        int iC = l1d.C(this.f.h1);
        if (iC == 1 || iC == 4) {
            o0c.q((String) null, this.f.Z.isEmpty());
            this.f.r();
            return;
        }
        if (iC != 5 && iC != 6) {
            eg.m("Camera closed while in state: ".concat(z5c.u(this.f.h1)));
            return;
        }
        p1d p1dVar = this.f;
        int i = p1dVar.X;
        if (i == 0) {
            p1dVar.J(false);
        } else {
            p1dVar.t("Camera closed due to error: ".concat(p1d.v(i)));
            b();
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f.t("CameraDevice.onDisconnected()");
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        p1d p1dVar = this.f;
        p1dVar.t = cameraDevice;
        p1dVar.X = i;
        it8 it8Var = p1dVar.g1;
        ((p1d) it8Var.c).t("Camera receive onErrorCallback");
        it8Var.h();
        int iC = l1d.C(this.f.h1);
        if (iC != 1) {
            switch (iC) {
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    cameraDevice.getId();
                    z5c.q(this.f.h1);
                    j2h1.o("Camera2CameraImpl");
                    o0c.q("Attempt to handle open error from non open state: ".concat(z5c.u(this.f.h1)), this.f.h1 == 8 || this.f.h1 == 9 || this.f.h1 == 10 || this.f.h1 == 7 || this.f.h1 == 6);
                    int i2 = 3;
                    if (i == 1 || i == 2 || i == 4) {
                        cameraDevice.getId();
                        j2h1.o("Camera2CameraImpl");
                        p1d p1dVar2 = this.f;
                        o0c.q("Can only reopen camera device after error if the camera device is actually in an error state.", p1dVar2.X != 0);
                        if (i == 1) {
                            i2 = 2;
                        } else if (i == 2) {
                            i2 = 1;
                        }
                        p1dVar2.E(7, new ky8(i2, null), true);
                        p1dVar2.q();
                    } else {
                        cameraDevice.getId();
                        j2h1.p("Camera2CameraImpl");
                        this.f.E(5, new ky8(i == 3 ? 5 : 6, null), true);
                        this.f.q();
                    }
                    break;
                default:
                    eg.m("onError() should not be possible from state: ".concat(z5c.u(this.f.h1)));
                    break;
            }
            return;
        }
        cameraDevice.getId();
        z5c.q(this.f.h1);
        j2h1.p("Camera2CameraImpl");
        this.f.q();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f.t("CameraDevice.onOpened()");
        p1d p1dVar = this.f;
        p1dVar.t = cameraDevice;
        p1dVar.X = 0;
        this.e.b = -1L;
        int iC = l1d.C(p1dVar.h1);
        if (iC == 1 || iC == 4) {
            o0c.q((String) null, this.f.Z.isEmpty());
            this.f.t.close();
            this.f.t = null;
        } else {
            if (iC != 5 && iC != 6 && iC != 7) {
                eg.m("onOpened() should not be possible from state: ".concat(z5c.u(this.f.h1)));
                return;
            }
            this.f.F(9);
            w4d w4dVar = this.f.Q0;
            String id = cameraDevice.getId();
            p1d p1dVar2 = this.f;
            if (w4dVar.e(id, p1dVar2.P0.S(p1dVar2.t.getId()))) {
                this.f.B();
            }
        }
    }
}
