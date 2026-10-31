package p;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pg40 implements vpx0 {
    public final da6 a;
    public final a1r0 b;
    public final rg40 c;
    public final c9n d;
    public final iu30 e;
    public final Set f = Collections.singleton(rxx0.a);
    public final x010 g;
    public final g891 h;

    public pg40(da6 da6Var, rg4 rg4Var, a1r0 a1r0Var, rg40 rg40Var, c9n c9nVar, iu30 iu30Var) {
        this.a = da6Var;
        this.b = a1r0Var;
        this.c = rg40Var;
        this.d = c9nVar;
        this.e = iu30Var;
        fn31.T(c9nVar, (o8n) null, 0, new j020(this, (lnm) null, (byte) 14), 3);
        this.g = new x010(da6Var.b, new huz(Boolean.valueOf(rg4Var.g()), (byte) 10), new vm0(3, (lnm) null, (byte) 15), (byte) 1);
        this.h = new g891((byte) 2);
    }

    public final Set b() {
        return this.f;
    }

    public final int c(rxx0 rxx0Var) {
        return 350;
    }

    public final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-488980583);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            ven0 ven0VarH = rwq.h(this.a.b, x340Var, 0);
            nmu0 nmu0Var = ((ea6) ven0VarH.getValue()).n;
            boolean z = ((ea6) ven0VarH.getValue()).o;
            boolean zI = x340Var.i(this) | x340Var.e(nmu0Var.ordinal());
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new hs20(this, nmu0Var, (byte) 9);
                x340Var.s0(objT);
            }
            mg40 mg40Var = new mg40(nmu0Var, z, (Function0) objT);
            otw.c(this.h, mg40Var, (qim0) null, wpb1.D("chip_generation_mode", this.h, mg40Var, x340Var, 6), x340Var, 0, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rr10(this, i, (byte) 27);
        }
    }

    public final String getId() {
        return "generation_mode";
    }

    public final mr20 isVisible() {
        return this.g;
    }
}
