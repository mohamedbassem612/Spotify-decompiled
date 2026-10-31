package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class klb extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ j2i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ klb(byte b, int i, j2i j2iVar, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.b = qim0Var;
        this.c = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.c;
        qim0 qim0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                bin.c(czo1.p(385), j2iVar, (b0k) obj, qim0Var);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                d1e.a(czo1.p(49), j2iVar, (b0k) obj, qim0Var);
                return rih1Var;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    gfh0 gfh0VarC = t1c.c(een.d, false);
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
                    dv20.l(0, j2iVar, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                fbp1.l(czo1.p(49), j2iVar, (b0k) obj, qim0Var);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                dio1.f(czo1.p(49), j2iVar, (b0k) obj, qim0Var);
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                p6p1.h(czo1.p(49), j2iVar, (b0k) obj, qim0Var);
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                wmo1.e(czo1.p(391), j2iVar, (b0k) obj, qim0Var);
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                htj0.c(czo1.p(49), j2iVar, (b0k) obj, qim0Var);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                fbp1.d(czo1.p(49), j2iVar, (b0k) obj, qim0Var);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klb(qim0 qim0Var, j2i j2iVar) {
        super(2);
        this.a = (byte) 2;
        this.b = qim0Var;
        this.c = j2iVar;
    }
}
