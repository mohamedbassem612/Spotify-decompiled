package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h9e0 extends kdn0 {
    public i9e0 N0;
    public final dan1 Y;
    public iac0 Z;

    public h9e0(dan1 dan1Var) {
        this.Y = dan1Var;
        if (dan1Var.a == null) {
            dan1Var.a = this;
        } else {
            eg.m("There is already a listener registered");
            throw null;
        }
    }

    public final void h() {
        dan1 dan1Var = this.Y;
        dan1Var.b = true;
        dan1Var.d = false;
        dan1Var.c = false;
        dan1Var.i.drainPermits();
        dan1Var.b();
        dan1Var.g = new yi7(dan1Var);
        dan1Var.a();
    }

    public final void i() {
        this.Y.b = false;
    }

    public final void k(rjp0 rjp0Var) {
        super/*p.ymd0*/.k(rjp0Var);
        this.Z = null;
        this.N0 = null;
    }

    public final void n() {
        dan1 dan1Var = this.Y;
        dan1Var.b();
        dan1Var.c = true;
        i9e0 i9e0Var = this.N0;
        if (i9e0Var != null) {
            k(i9e0Var);
        }
        h9e0 h9e0Var = dan1Var.a;
        if (h9e0Var == null) {
            eg.m("No listener register");
            return;
        }
        if (h9e0Var != this) {
            hhg1.n("Attempting to unregister the wrong listener");
            return;
        }
        dan1Var.a = null;
        if (i9e0Var != null) {
            boolean z = i9e0Var.b;
        }
        dan1Var.d = true;
        dan1Var.b = false;
        dan1Var.c = false;
        dan1Var.e = false;
    }

    public final void o() {
        iac0 iac0Var = this.Z;
        i9e0 i9e0Var = this.N0;
        if (iac0Var == null || i9e0Var == null) {
            return;
        }
        super/*p.ymd0*/.k(i9e0Var);
        f(iac0Var, i9e0Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        eqr0.n(this.Y, sb);
        sb.append("}}");
        return sb.toString();
    }
}
