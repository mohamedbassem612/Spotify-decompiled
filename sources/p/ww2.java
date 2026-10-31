package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ww2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m9h b;
    public final /* synthetic */ sw2 c;
    public final /* synthetic */ vw2 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ iu30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ww2(m9h m9hVar, sw2 sw2Var, vw2 vw2Var, boolean z, boolean z2, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = m9hVar;
        this.c = sw2Var;
        this.d = vw2Var;
        this.e = z;
        this.f = z2;
        this.g = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                iu30 iu30Var = this.g;
                int iP = czo1.p(196609);
                this.b.c(this.c, this.d, this.e, this.f, iu30Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                iu30 iu30Var2 = this.g;
                int iP2 = czo1.p(196609);
                this.b.c(this.c, this.d, this.e, this.f, iu30Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
