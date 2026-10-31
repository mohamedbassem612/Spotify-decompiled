package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s1g0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ u1g0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1g0(u1g0 u1g0Var) {
        super(2);
        this.b = u1g0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        u1g0 u1g0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    fj30.f(u1g0Var, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                fj30.f(u1g0Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1g0(u1g0 u1g0Var, int i) {
        super(2);
        this.b = u1g0Var;
    }
}
