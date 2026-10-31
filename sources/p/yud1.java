package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yud1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sud1 b;
    public final /* synthetic */ kly0 c;
    public final /* synthetic */ i8h1 d;
    public final /* synthetic */ gw10 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yud1(sud1 sud1Var, kly0 kly0Var, i8h1 i8h1Var, gw10 gw10Var, boolean z, String str, int i, byte b) {
        super(2);
        this.a = b;
        this.b = sud1Var;
        this.c = kly0Var;
        this.d = i8h1Var;
        this.e = gw10Var;
        this.f = z;
        this.g = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                String str = this.g;
                int iP = czo1.p(1);
                cvd1.a(this.b, this.c, this.d, this.e, this.f, str, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                String str2 = this.g;
                int iP2 = czo1.p(1);
                cvd1.a(this.b, this.c, this.d, this.e, this.f, str2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
