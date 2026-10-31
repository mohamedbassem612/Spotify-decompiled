package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i8 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n041 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i8(n041 n041Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = n041Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        n041 n041Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                gto1.b(n041Var, qim0Var, b0kVar, czo1.p(49));
                break;
            default:
                fj30.c(n041Var, qim0Var, b0kVar, czo1.p(49));
                break;
        }
        return rih1Var;
    }
}
