package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class px90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rx90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ px90(rx90 rx90Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = rx90Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rx90 rx90Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                rx90Var.c(b0kVar, czo1.p(1));
                break;
            default:
                rx90Var.d(b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
