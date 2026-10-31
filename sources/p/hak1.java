package p;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hak1 implements vpx0 {
    public final iu30 a;
    public final vlj1 c;
    public final Set b = Collections.singleton(rxx0.b);
    public final g891 d = new g891((byte) 5);

    public hak1(da6 da6Var, iu30 iu30Var) {
        this.a = iu30Var;
        this.c = new vlj1(da6Var.b, this, (byte) 4);
    }

    public final Set b() {
        return this.b;
    }

    public final int c(rxx0 rxx0Var) {
        return 150;
    }

    public final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-176023189);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            String strO0 = cwl1.o0(x340Var, 2131952949);
            boolean zI = x340Var.i(this) | x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new g4k1(this, strO0, (byte) 2);
                x340Var.s0(objT);
            }
            cak1 cak1Var = new cak1((Function0) objT);
            otw.c(this.d, cak1Var, (qim0) null, wpb1.D("chip_view_error", this.d, cak1Var, x340Var, 6), x340Var, 0, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fak1(this, i, (byte) 0);
        }
    }

    public final String getId() {
        return "view_error";
    }

    public final mr20 isVisible() {
        return this.c;
    }
}
