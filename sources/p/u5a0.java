package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u5a0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y5a0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u5a0(y5a0 y5a0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = y5a0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y5a0 y5a0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                y5a0Var.e(b0kVar, czo1.p(1));
                break;
            default:
                y5a0Var.i(b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
