package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ic4 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;

    public /* synthetic */ ic4(long j, vu30 vu30Var, int i) {
        this.c = j;
        this.b = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        long j = this.c;
        switch (b) {
            case 0:
                qim0 qim0Var = (qim0) obj3;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (j != 9205357640488583168L) {
                    x340Var2.i0(-1244013944);
                    qim0 qim0VarO = u291.o(qim0Var, s3v.b(j), s3v.a(j), 0.0f, 0.0f, 12);
                    gfh0 gfh0VarC = t1c.c(een.e, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarO);
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
                    kc4.b(0, 1, x340Var2, null);
                    x340Var2.r(true);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1243644858);
                    kc4.b(0, 0, x340Var2, qim0Var);
                    x340Var2.r(false);
                }
                return rih1Var;
            case 1:
                ((Integer) obj2).getClass();
                hr80.h(czo1.p(1), j, (b0k) obj, (qim0) obj3);
                return rih1Var;
            default:
                ((Integer) obj2).getClass();
                i3p1.h(j, (vu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    public /* synthetic */ ic4(long j, qim0 qim0Var) {
        this.c = j;
        this.b = qim0Var;
    }

    public /* synthetic */ ic4(qim0 qim0Var, long j, int i) {
        this.b = qim0Var;
        this.c = j;
    }
}
