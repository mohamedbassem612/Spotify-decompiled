package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pqu extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqu(int i, Integer num, float f, long j, int i2) {
        super(2);
        this.d = i;
        this.e = num;
        this.c = f;
        this.b = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                long j = this.b;
                int iP = czo1.p(1);
                qqu.a(this.d, (Integer) obj3, this.c, j, (b0k) obj, iP);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                buo1.l((hux) obj3, this.b, this.c, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = this.c;
                    boolean zD = x340Var2.d(f) | x340Var2.e(i);
                    long j2 = this.b;
                    boolean zF = x340Var2.f(j2) | zD;
                    Object objT = x340Var2.T();
                    if (zF || objT == fkj0.X) {
                        objT = new yes0(f, j2, i);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarS = exd0.s(nim0.a, (iu30) objT);
                    j2i j2iVar = (j2i) obj3;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarS);
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
                    dv20.l(0, j2iVar, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqu(float f, int i, long j, j2i j2iVar) {
        super(2);
        this.c = f;
        this.d = i;
        this.b = j;
        this.e = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqu(hux huxVar, long j, float f, int i) {
        super(2);
        this.e = huxVar;
        this.b = j;
        this.c = f;
        this.d = i;
    }
}
