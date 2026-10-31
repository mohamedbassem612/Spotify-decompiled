package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vka extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vnr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vka(vnr0 vnr0Var, int i) {
        super(2);
        this.a = (byte) 4;
        this.b = vnr0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        vnr0 vnr0Var = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    qgo1.f(this.b, uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, cbx.b(x340Var2).b.b, 7), new a0e1(3), 0, false, (iu30) null, x340Var2, 8, 56);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    qgo1.f(this.b, uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 16.0f, 7), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    Object objT = x340Var6.T();
                    if (objT == fkj0.X) {
                        objT = p7w0.R0;
                        x340Var6.s0(objT);
                    }
                    pxd0.n(vnr0Var, (iu30) objT, x340Var6, 56);
                }
                break;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    pxd0.s(vnr0Var, x340Var8, 8);
                }
                break;
            default:
                ((Number) obj2).intValue();
                pxd0.s(vnr0Var, (b0k) obj, czo1.p(9));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vka(vnr0 vnr0Var, byte b) {
        super(2);
        this.a = b;
        this.b = vnr0Var;
    }
}
