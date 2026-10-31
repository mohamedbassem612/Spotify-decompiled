package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b760 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nmo b;
    public final /* synthetic */ q10 c;
    public final /* synthetic */ gt40 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b760(nmo nmoVar, q10 q10Var, gt40 gt40Var, float f, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.b = nmoVar;
        this.c = q10Var;
        this.d = gt40Var;
        this.e = f;
        this.f = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                boolean z = this.f;
                int iP = czo1.p(1);
                c760.b(this.b, this.c, this.d, this.e, z, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                boolean z2 = this.f;
                int iP2 = czo1.p(1);
                c760.c(this.b, this.c, this.d, this.e, z2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
