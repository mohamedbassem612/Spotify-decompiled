package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class su61 {
    public final lzn0 a;
    public final i8h1 b;
    public final kv61 c;
    public final qyj d;
    public final qgl0 e = new qgl0(new pdl0((byte) 13), (byte) 0);

    public su61(lzn0 lzn0Var, i8h1 i8h1Var, kv61 kv61Var, qyj qyjVar) {
        this.a = lzn0Var;
        this.b = i8h1Var;
        this.c = kv61Var;
        this.d = qyjVar;
    }

    public final void a(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-40111675);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = x340Var.i(this) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new xt7(this, z, (byte) 8);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, sgj.a, x340Var, 0, 6, 1020);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kf2(this, z, i, (byte) 22);
        }
    }

    public final p2r0 b(String str, List list, int i) {
        return this.d.a(new j2i(1275898810, new kk31(this, i, list, str), true));
    }
}
