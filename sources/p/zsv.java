package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zsv extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tjq b;
    public final /* synthetic */ String c;
    public final /* synthetic */ htv d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ qim0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zsv(tjq tjqVar, String str, htv htvVar, iu30 iu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = tjqVar;
        this.c = str;
        this.d = htvVar;
        this.e = iu30Var;
        this.f = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.f;
                int iP = czo1.p(1);
                this.b.e(this.c, this.d, this.e, qim0Var, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.f;
                int iP2 = czo1.p(1);
                this.b.e(this.c, this.d, this.e, qim0Var2, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var3 = this.f;
                int iP3 = czo1.p(1);
                this.b.e(this.c, this.d, this.e, qim0Var3, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }
}
