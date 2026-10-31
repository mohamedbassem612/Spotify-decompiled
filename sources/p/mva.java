package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mva extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7x0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mva(r7x0 r7x0Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 1:
                this.b = r7x0Var;
                this.c = iu30Var;
                this.d = i;
                super(2);
                break;
            default:
                this.b = r7x0Var;
                this.c = iu30Var;
                this.d = i;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        nim0 nim0Var = nim0.a;
        iu30 iu30Var = this.c;
        r7x0 r7x0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                c8o.c(r7x0Var, iu30Var, nim0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                c8o.c(r7x0Var, iu30Var, nim0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
