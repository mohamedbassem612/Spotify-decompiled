package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class puq0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k37 b;
    public final /* synthetic */ k37 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ puq0(k37 k37Var, k37 k37Var2, float f, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = k37Var;
        this.c = k37Var2;
        this.d = f;
        this.e = qim0Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                quq0.a(this.b, this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                gke1.a(this.b, this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
