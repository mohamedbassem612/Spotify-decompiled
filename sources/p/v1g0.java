package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v1g0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u1g0 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1g0(u1g0 u1g0Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = u1g0Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        u1g0 u1g0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                fj30.a(u1g0Var, qim0Var, b0kVar, czo1.p(1));
                break;
            case 1:
                fj30.e(u1g0Var, qim0Var, b0kVar, czo1.p(1));
                break;
            case 2:
                fj30.g(u1g0Var, qim0Var, b0kVar, czo1.p(1));
                break;
            case 3:
                fj30.h(u1g0Var, qim0Var, b0kVar, czo1.p(1));
                break;
            case 4:
                fj30.i(u1g0Var, qim0Var, b0kVar, czo1.p(1));
                break;
            case 5:
                fj30.j(u1g0Var, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                fj30.n(u1g0Var, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
