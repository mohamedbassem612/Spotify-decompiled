package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ywv extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ eyv b;
    public final /* synthetic */ bxv c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywv(bxv bxvVar, eyv eyvVar, iu30 iu30Var) {
        super(3);
        this.c = bxvVar;
        this.b = eyvVar;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        eyv eyvVar = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar, 0);
                x340 x340Var = (x340) b0kVar;
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(b0kVar, nim0.a);
                hzj.A.getClass();
                x340 x340Var2 = (x340) b0kVar;
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
                nko1.H(mbhVarA, b0kVar, y580.O0);
                nko1.H(xos0VarM, b0kVar, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar, y580.R0);
                nko1.F(b0kVar);
                nko1.H(qim0VarE, b0kVar, y580.Y);
                vu30 vu30Var = bli.c;
                bxv bxvVar = this.c;
                bxvVar.c(null, null, vu30Var, b0kVar, 384);
                bxvVar.a(eyvVar.a.size(), iu30Var, b0kVar, 0);
                x340Var2.r(true);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                boolean z = eyvVar.d;
                this.c.d(z, iu30Var, (b0k) obj2, 0);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywv(eyv eyvVar, bxv bxvVar, iu30 iu30Var) {
        super(3);
        this.b = eyvVar;
        this.c = bxvVar;
        this.d = iu30Var;
    }
}
