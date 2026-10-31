package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x3y extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n5y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3y(n5y n5yVar, byte b) {
        super(3);
        this.a = b;
        this.b = n5yVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n5y n5yVar = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    String str = n5yVar.a;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, (qim0) null, cbx.d(x340Var2).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    Object objT = x340Var4.T();
                    if (objT == fkj0.X) {
                        obj4 = objT;
                        x0y x0yVar = x0y.X;
                        x340Var4.s0(x0yVar);
                        obj4 = x0yVar;
                    }
                    obj4 = objT;
                    qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) obj4);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    jto1.b(qim0VarB, new uvx(0, (pgx) null, 2, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 499), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-1233003652, new x3y(n5yVar, z ? 1 : 0), x340Var4), x340Var4, 64, 196608, 32764);
                }
                break;
        }
        return rih1Var;
    }
}
