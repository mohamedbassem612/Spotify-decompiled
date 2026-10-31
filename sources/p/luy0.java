package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class luy0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ luy0(iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        iu30 iu30Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ggo1.u(iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                y251.c(iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                xto1.q(iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 3:
                dro.u(iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                kln1.o(iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
