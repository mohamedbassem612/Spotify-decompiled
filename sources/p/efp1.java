package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class efp1 extends mgn1 {
    public final AtomicReference l;
    public final jim0 m;

    /* JADX WARN: Multi-variable type inference failed */
    public efp1(sgp1 sgp1Var) {
        this.l = new AtomicReference(sgp1Var);
        this.m = new jim0(sgp1Var.d, (byte) 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.mgn1
    public final void b1(int i) {
        xaa xaaVar = 0;
        sgp1 sgp1Var = (sgp1) this.l.getAndSet(null);
        if (sgp1Var != null) {
            sgp1Var.N = -1;
            sgp1Var.O = -1;
            sgp1Var.B = null;
            sgp1Var.H = null;
            sgp1Var.L = 0.0d;
            sgp1Var.T();
            sgp1Var.I = false;
            sgp1Var.M = null;
            xaaVar = sgp1Var;
        }
        if (xaaVar == 0) {
            return;
        }
        sgp1.T.a("ICastDeviceControllerListener.onDisconnected: %d", new Object[]{Integer.valueOf(i)});
        if (i != 0) {
            int i2 = xaaVar.x.get();
            opn1 opn1Var = xaaVar.f;
            opn1Var.sendMessage(opn1Var.obtainMessage(6, i2, 2));
        }
    }

    @Override // p.mgn1
    public final void e1(yz5 yz5Var, String str, String str2, boolean z) {
        sgp1 sgp1Var = (sgp1) this.l.get();
        if (sgp1Var == null) {
            return;
        }
        sgp1Var.B = yz5Var;
        sgp1Var.P = yz5Var.a;
        sgp1Var.Q = str2;
        sgp1Var.H = str;
        synchronized (sgp1.U) {
        }
    }

    @Override // p.mgn1
    public final void f1(int i) {
        if (((sgp1) this.l.get()) == null) {
            return;
        }
        synchronized (sgp1.U) {
        }
    }

    @Override // p.mgn1
    public final void g1(int i) {
        sgp1 sgp1Var = (sgp1) this.l.get();
        if (sgp1Var == null) {
            return;
        }
        sgp1Var.W(i);
    }

    @Override // p.mgn1
    public final void h1(int i) {
        sgp1 sgp1Var = (sgp1) this.l.get();
        if (sgp1Var == null) {
            return;
        }
        sgp1Var.W(i);
    }

    @Override // p.mgn1
    public final void i1(int i) {
        sgp1 sgp1Var = (sgp1) this.l.get();
        if (sgp1Var == null) {
            return;
        }
        sgp1Var.P = null;
        sgp1Var.Q = null;
        sgp1Var.W(i);
        if (sgp1Var.D != null) {
            this.m.post(new ukd(this, sgp1Var, i));
        }
    }

    @Override // p.mgn1
    public final void j1() {
        sgp1.T.a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // p.mgn1
    public final void k1(jdn1 jdn1Var) {
        sgp1 sgp1Var = (sgp1) this.l.get();
        if (sgp1Var == null) {
            return;
        }
        sgp1.T.a("onDeviceStatusChanged", new Object[0]);
        this.m.post(new mqh1(this, sgp1Var, jdn1Var, (byte) 19));
    }

    @Override // p.mgn1
    public final void l1(fbn1 fbn1Var) {
        sgp1 sgp1Var = (sgp1) this.l.get();
        if (sgp1Var == null) {
            return;
        }
        sgp1.T.a("onApplicationStatusChanged", new Object[0]);
        this.m.post(new mqh1(this, sgp1Var, fbn1Var, (byte) 20));
    }

    @Override // p.mgn1
    public final void m1(String str, String str2) {
        sgp1 sgp1Var = (sgp1) this.l.get();
        if (sgp1Var == null) {
            return;
        }
        sgp1.T.a("Receive (type=text, ns=%s) %s", new Object[]{str, str2});
        this.m.post(new sl21(this, sgp1Var, str, str2));
    }

    @Override // p.mgn1
    public final void n1(String str, byte[] bArr) {
        if (((sgp1) this.l.get()) == null) {
            return;
        }
        pue0 pue0Var = sgp1.T;
        sgp1.T.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[]{str, Integer.valueOf(bArr.length)});
    }

    @Override // p.mgn1
    public final void o1(int i, long j) {
        sgp1 sgp1Var = (sgp1) this.l.get();
        if (sgp1Var == null) {
            return;
        }
        sgp1Var.V(i, j);
    }

    @Override // p.mgn1
    public final void p1(long j) {
        sgp1 sgp1Var = (sgp1) this.l.get();
        if (sgp1Var == null) {
            return;
        }
        sgp1Var.V(0, j);
    }
}
