package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zt11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cs11 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zt11(cs11 cs11Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = cs11Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    r4p1.e(this.b, (qim0) null, (pgx) null, 0, this.c, x340Var2, 0, 14);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    ogx ogxVar = ogx.e;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    r4p1.e(this.b, uyn1.z(16.0f, 0.0f, 2, nim0.a), ogxVar, 2, this.c, x340Var4, 3072, 0);
                }
                break;
        }
        return rih1Var;
    }
}
