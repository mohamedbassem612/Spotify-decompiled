package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dtg0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cdo0 b;
    public final /* synthetic */ ctg0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ lee1 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dtg0(cdo0 cdo0Var, ctg0 ctg0Var, iu30 iu30Var, iu30 iu30Var2, lee1 lee1Var, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = cdo0Var;
        this.c = ctg0Var;
        this.d = iu30Var;
        this.e = iu30Var2;
        this.f = lee1Var;
        this.g = i;
        this.h = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                ftg0.a(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                ftg0.b(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                ftg0.c(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                ftg0.c(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }
}
