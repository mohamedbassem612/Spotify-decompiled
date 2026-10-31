package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class udy extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o17 b;
    public final /* synthetic */ n6r c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ udy(o17 o17Var, n6r n6rVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = o17Var;
        this.c = n6rVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n6r n6rVar = this.c;
        o17 o17Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                xdy.a(o17Var, n6rVar, b0kVar, czo1.p(1));
                break;
            default:
                sgc1.l(o17Var, n6rVar, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
