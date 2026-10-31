package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bgf1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yff1 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ pt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bgf1(yff1 yff1Var, iu30 iu30Var, ven0 ven0Var, pt ptVar, byte b) {
        super(2);
        this.a = b;
        this.b = yff1Var;
        this.c = iu30Var;
        this.d = ven0Var;
        this.e = ptVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        tob1 tob1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    yff1 yff1Var = this.b;
                    boolean z = yff1Var.d;
                    iu30 iu30Var = this.c;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new b1c1(iu30Var, (byte) 22);
                        x340Var2.s0(objT);
                    }
                    iu30 iu30Var2 = (iu30) objT;
                    boolean zI = x340Var2.i(yff1Var) | x340Var2.g(iu30Var);
                    tob1 tob1Var2 = this.d;
                    boolean zI2 = zI | x340Var2.i(tob1Var2);
                    pt ptVar = this.e;
                    boolean zI3 = zI2 | x340Var2.i(ptVar);
                    Object objT2 = x340Var2.T();
                    if (zI3 || objT2 == m4cVar) {
                        tob1Var = tob1Var2;
                        e971 e971Var = new e971(yff1Var, iu30Var, ptVar, tob1Var, (byte) 19);
                        x340Var2.s0(e971Var);
                        objT2 = e971Var;
                    } else {
                        tob1Var = tob1Var2;
                    }
                    x760.n(yff1Var, iu30Var2, qim0VarF, (iu30) objT2, z, x340Var2, 0);
                    lis0 lis0Var = (lis0) tob1Var.getValue();
                    if (lis0Var != null) {
                        x340Var2.i0(-503028014);
                        otw.c((pt) ptVar.i, lis0Var, (qim0) null, (ipb1) null, x340Var2, 8, 12);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-503028015);
                        x340Var2.r(false);
                    }
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-346169009, new bgf1(this.b, this.c, this.d, this.e, (byte) 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
