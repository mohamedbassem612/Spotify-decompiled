package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class okh0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pkh0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ okh0(pkh0 pkh0Var, String str, String str2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = pkh0Var;
        this.c = str;
        this.d = str2;
        this.e = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                this.b.e(iP, this.c, this.d, (b0k) obj, this.e);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(385);
                this.b.f(iP2, this.c, this.d, (b0k) obj, this.e);
                break;
        }
        return rih1Var;
    }
}
