package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o7w0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e9w0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7w0(e9w0 e9w0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = e9w0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        e9w0 e9w0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                a8o.l(e9w0Var, b0kVar, czo1.p(1));
                break;
            default:
                a8o.m(e9w0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
