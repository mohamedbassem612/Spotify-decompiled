package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tb9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb9(String str, String str2, String str3, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = str3;
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
                m1p1.a(this.b, this.c, this.d, qim0Var, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.e;
                int iP2 = czo1.p(1);
                dem1.g(this.b, this.c, this.d, qim0Var2, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var3 = this.e;
                int iP3 = czo1.p(1);
                ozn1.h(this.b, this.c, this.d, qim0Var3, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }
}
