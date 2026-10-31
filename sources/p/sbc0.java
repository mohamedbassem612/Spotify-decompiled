package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sbc0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rrt0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sbc0(rrt0 rrt0Var, byte b) {
        super(3);
        this.a = b;
        this.b = rrt0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rrt0 rrt0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    zkt0 zkt0Var = rrt0Var == rrt0.a ? zkt0.a : zkt0.b;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    wkt0.a(zkt0Var, u291.r(qim0VarB, 16.0f), null, 0L, false, x340Var2, 0, 28);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                    return rih1Var;
                }
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var4).b;
                qim0 qim0VarB2 = uyn1.B(nim0.a, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                int iOrdinal = rrt0Var.ordinal();
                if (iOrdinal == 0) {
                    str = "PlayIndicatorPlaying";
                } else if (iOrdinal == 1) {
                    str = "";
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    str = "PlayIndicatorPaused";
                }
                u4p1.J(rrt0Var, anm1.N(str, qim0VarB2), x340Var4, 0);
                return rih1Var;
        }
    }
}
