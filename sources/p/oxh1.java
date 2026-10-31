package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oxh1 implements vpx0 {
    public final yxb0 a;
    public final u9b b;
    public final xe01 c;
    public final Set d = Collections.singleton(rxx0.b);
    public final a1b1 e;

    public oxh1(da6 da6Var, yxb0 yxb0Var, u9b u9bVar, xe01 xe01Var) {
        this.a = yxb0Var;
        this.b = u9bVar;
        this.c = xe01Var;
        this.e = new a1b1(da6Var.b, this, (byte) 22);
    }

    @Override // p.vpx0
    public final zob1 a() {
        return this.c;
    }

    @Override // p.vpx0
    public final Set b() {
        return this.d;
    }

    @Override // p.vpx0
    public final int c(rxx0 rxx0Var) {
        return 200;
    }

    @Override // p.vpx0
    public final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1348907197);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            yxb0 yxb0Var = this.a;
            rih1 rih1Var = rih1.a;
            otw.c(yxb0Var, rih1Var, (qim0) null, wpb1.D("chip_upload", yxb0Var, rih1Var, x340Var, 390), x340Var, 48, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new muh1(this, i, (byte) 2);
        }
    }

    @Override // p.vpx0
    public final String getId() {
        return "upload";
    }

    @Override // p.vpx0
    public final mr20 isVisible() {
        return this.e;
    }
}
