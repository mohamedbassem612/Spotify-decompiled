package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ac40 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ic40 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac40(iu30 iu30Var, ic40 ic40Var, int i) {
        super(2);
        this.c = iu30Var;
        this.b = ic40Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        ic40 ic40Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                d1u.d(czo1.p(1), b0kVar, iu30Var, ic40Var);
                break;
            default:
                d1u.p(czo1.p(1), b0kVar, iu30Var, ic40Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac40(ic40 ic40Var, iu30 iu30Var, int i) {
        super(2);
        this.b = ic40Var;
        this.c = iu30Var;
    }
}
