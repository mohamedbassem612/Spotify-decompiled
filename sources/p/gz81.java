package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gz81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hz81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz81(hz81 hz81Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = hz81Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hz81 hz81Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                hz81Var.a(b0kVar, czo1.p(1));
                break;
            default:
                xap1.d(hz81Var, b0kVar, czo1.p(9));
                break;
        }
        return rih1Var;
    }
}
