package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z6e extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t6e b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ t9p d;
    public final /* synthetic */ d0r e;
    public final /* synthetic */ gw70 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6e(t6e t6eVar, iu30 iu30Var, t9p t9pVar, d0r d0rVar, gw70 gw70Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = t6eVar;
        this.c = iu30Var;
        this.d = t9pVar;
        this.e = d0rVar;
        this.f = gw70Var;
        this.g = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                dio1.b(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                dio1.b(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
