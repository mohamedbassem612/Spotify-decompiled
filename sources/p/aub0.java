package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class aub0 {
    public static final ptb0 a = new ptb0(null, 0, false, 0.0f, new ztb0((byte) 0), 0.0f, false, smo1.e(o6x.a), j2h1.c(1.0f), jjl.b(0, 0, 0, 0, 15), 0, z6x.a, 0, 0, 0, false, qqq0.a, 0, 0);

    public static final xtb0 a(int i, b0k b0kVar, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        df41 df41Var = xtb0.y;
        df41 df41VarK = rno1.k();
        boolean zE = ((x340) b0kVar).e(i) | ((x340) b0kVar).e(0);
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (zE || objT == fkj0.X) {
            objT = new ytb0(i, (byte) 0);
            x340Var.s0(objT);
        }
        return (xtb0) k5p1.u(objArr, df41VarK, (Function0) objT, x340Var, 0);
    }
}
