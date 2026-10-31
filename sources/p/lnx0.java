package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lnx0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ idm b;
    public final /* synthetic */ wcm c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lnx0(idm idmVar, wcm wcmVar, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = idmVar;
        this.c = wcmVar;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        wcm wcmVar = this.c;
        idm idmVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                hon1.a(idmVar, wcmVar, iu30Var, b0kVar, czo1.p(1));
                break;
            default:
                n8p1.c(idmVar, wcmVar, iu30Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
