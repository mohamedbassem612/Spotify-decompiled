package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t3l extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xvd1 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3l(xvd1 xvd1Var, long j, int i, byte b) {
        super(2);
        this.a = b;
        this.b = xvd1Var;
        this.c = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j = this.c;
        xvd1 xvd1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                qxy0.m(xvd1Var, j, b0kVar, czo1.p(1));
                break;
            default:
                qxy0.m(xvd1Var, j, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
