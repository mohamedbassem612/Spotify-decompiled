package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fxb0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kxb0 b;
    public final /* synthetic */ ji0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ni7 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fxb0(kxb0 kxb0Var, ji0 ji0Var, int i, ni7 ni7Var, String str, iu30 iu30Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = kxb0Var;
        this.c = ji0Var;
        this.d = i;
        this.e = ni7Var;
        this.f = str;
        this.g = iu30Var;
        this.h = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                this.b.f(this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.g(this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
