package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lx01 extends o6 implements qzh {
    public final hrr0 N0;
    public iu30 O0;
    public kx21 P0;
    public final lx01 Q0;

    public lx01(Context context) {
        super(context, (AttributeSet) null, 0);
        this.N0 = v8r.q(new jx01(false));
        this.O0 = jt01.d1;
        this.Q0 = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jx01 getState() {
        return (jx01) this.N0.getValue();
    }

    private final void setState(jx01 jx01Var) {
        this.N0.setValue(jx01Var);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1851938298);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nyx.a(2, (wux) null, apo.r(873777177, new kx01(this), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kx01(this, i);
        }
    }

    public final void f(Object obj) {
        setState((jx01) obj);
    }

    public View getView() {
        return this.Q0;
    }

    public final void n(iu30 iu30Var) {
        this.O0 = iu30Var;
    }

    public final void setResources(kx21 kx21Var) {
        this.P0 = kx21Var;
    }

    public final void y(jx01 jx01Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-850793163);
        int i2 = (x340Var.g(jx01Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            fq7.g(jx01Var.a, (qim0) null, xa4.q().a(xay.d(irn1.o0(300, 0, (dlv) null, 6), een.Z, 12)), xa4.r().a(xay.l(12, irn1.o0(300, 0, (dlv) null, 6))), (String) null, apo.r(-189348003, new hov0(this, qim0Var, (byte) 15), x340Var), x340Var, 196608, 18);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0(this, jx01Var, qim0Var, i, (byte) 22);
        }
    }
}
