package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xsv extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tjq b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xsv(tjq tjqVar, boolean z, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = tjqVar;
        this.c = z;
        this.d = iu30Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        iu30 iu30Var = this.d;
        boolean z = this.c;
        tjq tjqVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                tjqVar.a(z, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                tjqVar.c(z, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
