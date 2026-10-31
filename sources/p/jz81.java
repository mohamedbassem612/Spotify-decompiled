package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jz81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ysf0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Boolean d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jz81(ysf0 ysf0Var, int i, Boolean bool, iu30 iu30Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = ysf0Var;
        this.c = i;
        this.d = bool;
        this.e = iu30Var;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                yap1.e(this.b, this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                yap1.e(this.b, this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
