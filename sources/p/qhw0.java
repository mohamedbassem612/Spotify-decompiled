package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qhw0 implements byf0 {
    public final dg30 a;
    public final mr20 b;
    public final ynb0 c;
    public final q8n d;
    public xab1 e;

    public qhw0(dg30 dg30Var, mr20 mr20Var, ynb0 ynb0Var, q8n q8nVar) {
        this.a = dg30Var;
        this.b = mr20Var;
        this.c = ynb0Var;
        this.d = q8nVar;
    }

    @Override // p.byf0
    public final void c() {
        xab1 xab1Var = this.e;
        if (xab1Var != null) {
            xab1Var.d(null);
        }
        xab1 xab1VarU = l4p1.u(cto1.q(this.a), f5p1.q(o4p1.r(this.b, this.d), new u98(this)));
        this.e = xab1VarU;
        xab1VarU.L(new hzu0(this, xab1VarU, (byte) 22));
    }

    @Override // p.byf0
    public final void d() {
        xab1 xab1Var = this.e;
        if (xab1Var != null) {
            xab1Var.d(null);
        }
        this.e = null;
    }

    @Override // p.byf0
    public final void g(ViewGroup viewGroup) {
    }
}
