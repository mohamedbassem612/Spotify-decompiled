package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wpw0 implements vpx0 {
    public final da6 a;
    public final xpw0 b;
    public final idd1 c = new idd1(new z6v0(this, (byte) 17));
    public final String d = "privacy";
    public final Set e = Collections.singleton(rxx0.a);
    public final m9r0 f;

    public wpw0(da6 da6Var, xpw0 xpw0Var) {
        this.a = da6Var;
        this.b = xpw0Var;
        this.f = new m9r0(da6Var.b, this, (byte) 24);
    }

    public final Set b() {
        return this.e;
    }

    public final int c(rxx0 rxx0Var) {
        return 200;
    }

    public final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(799641578);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            ven0 ven0VarH = rwq.h(this.a.b, x340Var, 0);
            cpw0 cpw0Var = new cpw0(((ea6) ven0VarH.getValue()).b, ((ea6) ven0VarH.getValue()).c, ((ea6) ven0VarH.getValue()).d);
            idd1 idd1Var = this.c;
            otw.c((fpw0) idd1Var.getValue(), cpw0Var, (qim0) null, wpb1.D("chip_privacy", (fpw0) idd1Var.getValue(), cpw0Var, x340Var, 6), x340Var, 0, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y6w0(this, i, (byte) 7);
        }
    }

    public final String getId() {
        return this.d;
    }

    public final mr20 isVisible() {
        return this.f;
    }
}
