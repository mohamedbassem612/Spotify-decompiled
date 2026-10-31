package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u2y extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2y(int i, Function0 function0, boolean z) {
        super(2);
        this.a = (byte) 5;
        this.b = z;
        this.c = function0;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Function0 function0 = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                acq0.d(czo1.p(1 | i), function0, (b0k) obj, z);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                h7p1.o(czo1.p(1 | i), function0, (b0k) obj, z);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                d7e.a(i, czo1.p(1), function0, (b0k) obj, z);
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                u7n0.g(i, czo1.p(1), function0, (b0k) obj, z);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ltn1.p(czo1.p(1 | i), function0, (b0k) obj, z);
                return rih1Var;
            case 5:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    long jC = cbx.a(x340Var2).a.a.c();
                    cua cuaVar = cbx.b(x340Var2).f;
                    qim0 qim0VarF = dug.f(nim0.a, jC, er31.b(16.0f));
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
                    hzj.A.getClass();
                    j2i j2iVarR = null;
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    if (z) {
                        x340Var2.i0(317770272);
                        j2iVarR = apo.r(1992115497, new oa5(function0, (byte) 14), x340Var2);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(318197111);
                        x340Var2.r(false);
                    }
                    jto1.b((qim0) null, (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, f5j.b, (xu30) null, (xu30) null, (xu30) null, j2iVarR, (xu30) null, (xu30) null, apo.r(1123377553, new f13(i, (byte) 14), x340Var2), x340Var2, 100663296, 196608, 28415);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                y251.d(czo1.p(1 | i), function0, (b0k) obj, z);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                cvd1.g(czo1.p(1 | i), function0, (b0k) obj, z);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2y(byte b, int i, Function0 function0, boolean z) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = function0;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2y(int i, boolean z, Function0 function0, int i2, byte b) {
        super(2);
        this.a = b;
        this.d = i;
        this.b = z;
        this.c = function0;
    }
}
