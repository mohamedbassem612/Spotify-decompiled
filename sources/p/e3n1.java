package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e3n1 implements xpw, cvl1 {
    public final rey0 a = new rey0(new kk11(this, (byte) 15));
    public final hy00 b = n3o1.r(this).c(yxl1.T0, yxl1.U0);
    public final psw c;

    public e3n1() {
        j2i j2iVar = new j2i(747666658, new fbm1(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.b;
    }

    public final jsw c() {
        return this.c;
    }

    public final void e(iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-372166029);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            ldx ldxVar = ldx.c;
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new wel1(iu30Var, (byte) 20);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, ktj.a, x340Var, 0, 6, 1020);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z2n1(this, iu30Var, i);
        }
    }

    public final mqw getBehavior() {
        return this.a;
    }
}
