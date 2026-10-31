package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j8 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wz31 b;
    public final /* synthetic */ n041 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8(wz31 wz31Var, n041 n041Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = wz31Var;
        this.c = n041Var;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        n041 n041Var = this.c;
        wz31 wz31Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                gto1.c(wz31Var, n041Var, qim0Var, b0kVar, czo1.p(385));
                break;
            default:
                fj30.d(wz31Var, n041Var, qim0Var, b0kVar, czo1.p(385));
                break;
        }
        return rih1Var;
    }
}
