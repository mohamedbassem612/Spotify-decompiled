package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n37 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q431 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ j6m d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n37(q431 q431Var, String str, j6m j6mVar, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = q431Var;
        this.c = str;
        this.d = j6mVar;
        this.e = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                int iP = czo1.p(1);
                epo1.a(this.b, this.c, this.d, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.e;
                int iP2 = czo1.p(1);
                epo1.a(this.b, this.c, this.d, qim0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
