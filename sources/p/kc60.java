package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kc60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kc60(tob1 tob1Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = tob1Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        tob1 tob1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                lc60.a(czo1.p(1), b0kVar, qim0Var, tob1Var);
                break;
            default:
                lc60.b(czo1.p(1), b0kVar, qim0Var, tob1Var);
                break;
        }
        return rih1Var;
    }
}
