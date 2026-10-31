package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class luy extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ouy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ luy(ouy ouyVar, byte b) {
        super(3);
        this.a = b;
        this.b = ouyVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                this.b.d((b0k) obj2, 0);
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                gwq gwqVar = (gwq) rwq.h(((buy) obj).g, b0kVar, 0).getValue();
                ouy ouyVar = this.b;
                ouyVar.c(24576, ouyVar.b.a, gwqVar.b, b0kVar, mqo1.A(gwqVar.a), gwqVar.c);
                break;
        }
        return rih1Var;
    }
}
