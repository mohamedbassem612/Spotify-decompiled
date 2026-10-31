package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lb2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rwj b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb2(rwj rwjVar, iu30 iu30Var, int i, qim0 qim0Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = rwjVar;
        this.c = iu30Var;
        this.d = i;
        this.e = qim0Var;
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
                this.b.l(this.d, iP, (b0k) obj, this.c, this.e);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.m(this.d, iP2, (b0k) obj, this.c, this.e);
                break;
        }
        return rih1Var;
    }
}
