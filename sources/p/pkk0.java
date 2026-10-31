package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pkk0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kkk0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ xsk d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pkk0(kkk0 kkk0Var, iu30 iu30Var, xsk xskVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = kkk0Var;
        this.c = iu30Var;
        this.d = xskVar;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        xsk xskVar = this.d;
        iu30 iu30Var = this.c;
        kkk0 kkk0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                t3p1.c(kkk0Var, iu30Var, xskVar, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                t3p1.d(kkk0Var, iu30Var, xskVar, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                t3p1.e(kkk0Var, iu30Var, xskVar, b0kVar, czo1.p(i | 1));
                break;
            case 3:
                t3p1.g(kkk0Var, iu30Var, xskVar, b0kVar, czo1.p(i | 1));
                break;
            case 4:
                t3p1.h(kkk0Var, iu30Var, xskVar, b0kVar, czo1.p(i | 1));
                break;
            default:
                t3p1.t(kkk0Var, iu30Var, xskVar, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
