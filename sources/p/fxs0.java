package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fxs0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fxs0(String str, float f, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        String str = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                fuo1.g(str, f, b0kVar, czo1.p(1));
                break;
            case 1:
                w2g0.e(str, f, b0kVar, czo1.p(1));
                break;
            default:
                w2g0.e(str, f, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
