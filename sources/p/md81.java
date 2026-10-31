package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class md81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ od81 b;
    public final /* synthetic */ ksw c;
    public final /* synthetic */ he81 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ md81(od81 od81Var, ksw kswVar, he81 he81Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = od81Var;
        this.c = kswVar;
        this.d = he81Var;
        this.e = iu30Var;
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
                this.b.d(iP, (b0k) obj, this.c, this.e, this.d);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.e(iP2, (b0k) obj, this.c, this.e, this.d);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                this.b.f(iP3, (b0k) obj, this.c, this.e, this.d);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md81(od81 od81Var, he81 he81Var, iu30 iu30Var, ksw kswVar, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = od81Var;
        this.d = he81Var;
        this.e = iu30Var;
        this.c = kswVar;
        this.f = i;
    }
}
