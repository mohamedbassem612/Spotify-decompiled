package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x5l1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u7h b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5l1(u7h u7hVar, String str, long j, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = u7hVar;
        this.c = str;
        this.d = j;
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
                lcc.g(this.b, this.c, this.d, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.e;
                int iP2 = czo1.p(1);
                lcc.h(this.b, this.c, this.d, qim0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
