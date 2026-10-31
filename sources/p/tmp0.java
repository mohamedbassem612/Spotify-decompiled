package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tmp0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hyo1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tmp0(hyo1 hyo1Var, byte b) {
        super(3);
        this.a = b;
        this.b = hyo1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        hyo1 hyo1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    hux huxVar = ((e471) hyo1Var).c;
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    w0h1.a(huxVar, isl.a, uyn1.x(qim0VarD, 8.0f), ((vex) zex.a.b).b, 0L, false, x340Var2, 56, 48);
                }
                break;
            default:
                g2c g2cVar = (g2c) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var3.g(g2cVar) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 19) != 18)) {
                    x340Var4.b0();
                } else {
                    hux huxVar2 = ((f471) hyo1Var).c;
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var4).g;
                    w0h1.a(huxVar2, isl.a, g2cVar.a(u291.r(nim0Var, 24.0f), een.h), ((vex) zex.a.b).b, 0L, false, x340Var4, 56, 48);
                }
                break;
        }
        return rih1Var;
    }
}
