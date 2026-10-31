package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mec0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ gbx c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mec0(String str, gbx gbxVar, qim0 qim0Var, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = gbxVar;
        this.d = qim0Var;
        this.e = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                boolean z = this.e;
                int iP = czo1.p(1);
                oec0.b(this.b, this.c, this.d, z, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                boolean z2 = this.e;
                int iP2 = czo1.p(1);
                ozn1.f(this.b, this.c, this.d, z2, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                boolean z3 = this.e;
                int iP3 = czo1.p(1);
                vzn1.e(this.b, this.c, this.d, z3, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                boolean z4 = this.e;
                int iP4 = czo1.p(1);
                rzn1.g(this.b, this.c, this.d, z4, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }
}
