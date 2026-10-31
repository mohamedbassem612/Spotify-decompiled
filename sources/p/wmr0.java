package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wmr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xfx b;
    public final /* synthetic */ tja c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmr0(xfx xfxVar, tja tjaVar, qim0 qim0Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = xfxVar;
        this.c = tjaVar;
        this.d = qim0Var;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                iu30 iu30Var = this.e;
                int iP = czo1.p(1);
                n3o1.e(this.b, this.c, this.d, iu30Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                iu30 iu30Var2 = this.e;
                int iP2 = czo1.p(1);
                s3o1.i(this.b, this.c, this.d, iu30Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
