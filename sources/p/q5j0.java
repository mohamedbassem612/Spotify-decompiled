package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q5j0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hdn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q5j0(hdn0 hdn0Var, byte b) {
        super(3);
        this.a = b;
        this.b = hdn0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        err0 err0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                float fM0 = ((wat) x340Var.k(t4k.h)).M0(err0Var.s());
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, fM0 - 8.0f));
                break;
            case 1:
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                float fM1 = ((wat) x340Var2.k(t4k.h)).M0(err0Var.s());
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                op71.g(x340Var2, u291.h(nim0Var, fM1 - 8.0f));
                break;
            case 2:
                ((Number) obj3).intValue();
                x340 x340Var3 = (b0k) obj2;
                float fM2 = ((wat) x340Var3.k(t4k.h)).M0(err0Var.s());
                uwr uwrVar3 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var3).b;
                op71.g(x340Var3, u291.h(nim0Var, fM2 - 4.0f));
                break;
            case 3:
                ((Number) obj3).intValue();
                sj1.d(err0Var.s(), 390, "-", (b0k) obj2);
                break;
            default:
                ((Number) obj3).intValue();
                sj1.d(err0Var.s(), 390, "+", (b0k) obj2);
                break;
        }
        return rih1Var;
    }
}
