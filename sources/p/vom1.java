package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vom1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oom1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vom1(oom1 oom1Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = oom1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oom1 oom1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                bqn1.r(oom1Var, b0kVar, czo1.p(1));
                break;
            case 1:
                bqn1.r(oom1Var, b0kVar, czo1.p(1));
                break;
            default:
                bqn1.s(oom1Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
