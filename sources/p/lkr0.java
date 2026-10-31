package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class lkr0 {
    public static final kkr0 a;
    public static final xjr0 b;

    static {
        kkr0 kkr0Var = new kkr0((byte) 0);
        a = kkr0Var;
        b = new xjr0(0, 0, 0, qqq0.b, 0, 0, 0, zov0.g, new ztb0((byte) 1), smo1.e(o6x.a), kkr0Var, jjl.b(0, 0, 0, 0, 15));
    }

    public static final long a(xjr0 xjr0Var, int i) {
        int i2 = xjr0Var.c;
        int i3 = xjr0Var.b;
        long j = ((long) i) * ((long) (i2 + i3));
        int i4 = -xjr0Var.f;
        int i5 = xjr0Var.d;
        long j2 = ((j + ((long) i4)) + ((long) i5)) - ((long) i2);
        int iG = (int) (xjr0Var.e == qqq0.b ? xjr0Var.g() >> 32 : xjr0Var.g() & 4294967295L);
        long jP = j2 - ((long) (iG - yoi1.p(xjr0Var.n.a(iG, i3, i4, i5), 0, iG)));
        if (jP < 0) {
            return 0L;
        }
        return jP;
    }

    public static final kes b(int i, Function0 function0, b0k b0kVar, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        df41 df41Var = kes.I;
        df41 df41VarQ = n8p1.q();
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && ((x340) b0kVar).e(i)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && ((x340) b0kVar).d(0.0f)) || (i2 & 48) == 32);
        if ((((i2 & 896) ^ 384) <= 256 || !((x340) b0kVar).g(function0)) && (i2 & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (z3 || objT == fkj0.X) {
            objT = new u170(i, function0);
            x340Var.s0(objT);
        }
        kes kesVar = (kes) k5p1.u(objArr, df41VarQ, (Function0) objT, x340Var, 0);
        kesVar.H.setValue(function0);
        return kesVar;
    }
}
