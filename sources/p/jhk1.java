package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jhk1 implements ko21, o5s {
    public final rf01 a;
    public final zy70 b;
    public final h180 c;
    public final x8c0 d;
    public final faa0 e;

    public jhk1(rf01 rf01Var, zy70 zy70Var, h180 h180Var, x8c0 x8c0Var, faa0 faa0Var) {
        this.a = rf01Var;
        this.b = zy70Var;
        this.c = h180Var;
        this.d = x8c0Var;
        this.e = faa0Var;
    }

    @Override // p.ko21
    public final Object a(qf01 qf01Var) {
        Object objN;
        x8c0 x8c0Var = this.d;
        return (x8c0Var == null || (objN = u890.n(x8c0Var, qf01Var)) != d9n.a) ? rih1.a : objN;
    }

    @Override // p.ko21
    public final void c() {
        h180 h180Var = this.c;
        if (h180Var.b.isAttachedToWindow()) {
            return;
        }
        khk1 khk1VarW = eth.w(h180Var.b);
        jhk1 jhk1Var = khk1VarW.d;
        if (jhk1Var != null) {
            jhk1Var.d();
        }
        khk1VarW.d = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    public final void d() {
        ha71.o(this.e);
        h180 h180Var = this.c;
        boolean z = h180Var instanceof hac0;
        x8c0 x8c0Var = this.d;
        if (z && x8c0Var != null) {
            x8c0Var.d(h180Var);
        }
        if (x8c0Var != null) {
            x8c0Var.d(this);
        }
    }

    @Override // p.o5s
    public final void onDestroy(iac0 iac0Var) {
        eth.w(this.c.b).a();
    }

    @Override // p.ko21
    public final void start() {
        x8c0 x8c0Var = this.d;
        if (x8c0Var != null) {
            x8c0Var.a(this);
        }
        h180 h180Var = this.c;
        if ((h180Var instanceof hac0) && x8c0Var != null) {
            h180 h180Var2 = h180Var;
            x8c0Var.d(h180Var2);
            x8c0Var.a(h180Var2);
        }
        khk1 khk1VarW = eth.w(h180Var.b);
        jhk1 jhk1Var = khk1VarW.d;
        if (jhk1Var != null) {
            jhk1Var.d();
        }
        khk1VarW.d = this;
    }
}
