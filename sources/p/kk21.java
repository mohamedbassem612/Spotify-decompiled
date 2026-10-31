package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kk21 extends auj {
    public final nkx0 Y1;
    public iu30 Z1 = ma21.Y0;

    public kk21(nkx0 nkx0Var) {
        this.Y1 = nkx0Var;
    }

    public final void k1(t4n t4nVar) {
        t4nVar.g().L(3);
    }

    public final void n1(xtj xtjVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1206448293);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            nyx.a(2, (wux) null, apo.r(1519019826, new ps11(this, (byte) 13), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tc11(this, xtjVar, i, (byte) 16);
        }
    }

    public final void v0(Context context) {
        this.Y1.f(this);
        super/*p.t2u*/.v0(context);
    }
}
