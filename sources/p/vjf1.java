package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vjf1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xjf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vjf1(xjf1 xjf1Var, byte b) {
        super(3);
        this.a = b;
        this.b = xjf1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        xjf1 xjf1Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = xjf1Var.c;
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(b0kVar).e;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                cvx cvxVar = cbx.b(b0kVar).b;
                uwo1.e(str, uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 4.0f, 7), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2024);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = xjf1Var.d;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 0.0f, 0.0f, cbx.b(b0kVar2).b.a, 7), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
                break;
        }
        return rih1Var;
    }
}
