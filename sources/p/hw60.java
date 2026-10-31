package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hw60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hw60(c380 c380Var, String str, String str2, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.b = c380Var;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                xto1.k(czo1.p(i | 1), this.c, this.d, (b0k) obj, this.b, this.e);
                break;
            default:
                ((Number) obj2).intValue();
                xto1.t(czo1.p(i | 1), this.c, this.d, (b0k) obj, this.b, this.e);
                break;
        }
        return rih1Var;
    }
}
