package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h1i1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xyh1 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1i1(xyh1 xyh1Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = xyh1Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        xyh1 xyh1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                qmo1.f(xyh1Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                qmo1.f(xyh1Var, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                qmo1.g(xyh1Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                qmo1.g(xyh1Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
