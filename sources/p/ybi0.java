package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ybi0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cr00 b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ j2i d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ch7 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ybi0(cr00 cr00Var, vu30 vu30Var, j2i j2iVar, boolean z, ch7 ch7Var, boolean z2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = cr00Var;
        this.c = vu30Var;
        this.d = j2iVar;
        this.e = z;
        this.f = ch7Var;
        this.g = z2;
        this.h = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                yoo1.n(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                yoo1.p(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                yoo1.q(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }
}
