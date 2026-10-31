package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jxj0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ vu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxj0(qim0 qim0Var, vu30 vu30Var) {
        super(2);
        this.b = qim0Var;
        this.c = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.c;
        qim0 qim0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                s1p1.j(czo1.p(7), (b0k) obj, vu30Var, qim0Var);
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
                    hzj.A.getClass();
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
                    us71.j(0, vu30Var, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxj0(qim0 qim0Var, vu30 vu30Var, int i) {
        super(2);
        this.b = qim0Var;
        this.c = vu30Var;
    }
}
