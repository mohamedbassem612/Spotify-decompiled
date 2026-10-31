package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wwt0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xwt0 b;
    public final /* synthetic */ vwt0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wwt0(xwt0 xwt0Var, vwt0 vwt0Var, byte b) {
        super(2);
        this.a = b;
        this.b = xwt0Var;
        this.c = vwt0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xwt0 xwt0Var = this.b;
        vwt0 vwt0Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    otw.c(xwt0Var.b, new a371(vwt0Var.a), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    otw.c(xwt0Var.c, new umg1(vwt0Var.a), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var6).b;
                    qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    zzq0 zzq0VarH = uyn1.h(2, cbx.b(x340Var6).b.a, 0.0f);
                    boolean zI = x340Var6.i(xwt0Var) | x340Var6.g(vwt0Var);
                    Object objT = x340Var6.T();
                    if (zI || objT == fkj0.X) {
                        objT = new aft0(xwt0Var, vwt0Var, (byte) 10);
                        x340Var6.s0(objT);
                    }
                    too1.b(qim0VarB, (xtb0) null, zzq0VarH, (iu30) objT, x340Var6, 0, 2);
                }
                break;
        }
        return rih1Var;
    }
}
