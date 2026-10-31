package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mnx0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xho b;
    public final /* synthetic */ uho c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mnx0(xho xhoVar, uho uhoVar, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = xhoVar;
        this.c = uhoVar;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        uho uhoVar = this.c;
        xho xhoVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                hon1.b(xhoVar, uhoVar, iu30Var, b0kVar, czo1.p(9));
                break;
            default:
                n8p1.d(xhoVar, uhoVar, iu30Var, b0kVar, czo1.p(9));
                break;
        }
        return rih1Var;
    }
}
