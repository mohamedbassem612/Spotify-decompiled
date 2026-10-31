package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a8b1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k37 b;
    public final /* synthetic */ k37 c;
    public final /* synthetic */ k37 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a8b1(k37 k37Var, k37 k37Var2, k37 k37Var3, float f, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = k37Var;
        this.c = k37Var2;
        this.d = k37Var3;
        this.e = f;
        this.f = qim0Var;
        this.g = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                b8b1.a(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                hke1.a(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
