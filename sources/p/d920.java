package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d920 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ iu30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d920(String str, String str2, String str3, boolean z, qim0 qim0Var, iu30 iu30Var, int i) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = qim0Var;
        this.g = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                iu30 iu30Var = this.g;
                j0p1.b(czo1.p(1), this.b, this.c, this.d, (b0k) obj, iu30Var, this.f, this.e);
                break;
            default:
                ((Number) obj2).intValue();
                iu30 iu30Var2 = this.g;
                dem1.i(czo1.p(1), this.b, this.c, this.d, (b0k) obj, iu30Var2, this.f, this.e);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d920(boolean z, String str, String str2, String str3, qim0 qim0Var, iu30 iu30Var, int i) {
        super(2);
        this.e = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = qim0Var;
        this.g = iu30Var;
    }
}
