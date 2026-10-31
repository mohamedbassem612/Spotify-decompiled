package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lj10 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jj10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj10(jj10 jj10Var, int i) {
        super(2);
        this.a = (byte) 3;
        this.b = jj10Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        jj10 jj10Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (jj10Var.f == 4) {
                    x340Var2.i0(958445256);
                    w0h1.a(pox.c, isl.a, (qim0) null, 0L, 0L, true, x340Var2, pox.d | 196656, 28);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(958616314);
                    x340Var2.r(false);
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                    return rih1Var;
                }
                switch (l1d.C(jj10Var.f)) {
                    case 0:
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                        x340Var4.i0(-2130943972);
                        w0h1.a(dnx.c, isl.a, anm1.N("CtaExternalLinkIcon", nim0Var), 0L, 0L, false, x340Var4, dnx.d | 48, 56);
                        x340Var4.r(false);
                        return rih1Var;
                    case 3:
                        x340Var4.i0(-2130734164);
                        x340Var4.r(false);
                        return rih1Var;
                    default:
                        eg.o();
                        return null;
                }
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qim0 qim0VarN = anm1.N("EventEndedLabel", nim0Var);
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(x340Var6).f;
                    qim0 qim0VarF = dug.f(i1p1.q(qim0VarN, er31.b(2.0f)), cbx.a(x340Var6).a.c, d4o1.a);
                    cvx cvxVar = cbx.b(x340Var6).b;
                    cvx cvxVar2 = cbx.b(x340Var6).b;
                    uwo1.e(jj10Var.l, uyn1.y(qim0VarF, 8.0f, 4.0f), cbx.d(x340Var6).k, cbx.a(x340Var6).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var6, 0, 0, 1712);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                cuo1.w(jj10Var, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lj10(jj10 jj10Var, byte b) {
        super(2);
        this.a = b;
        this.b = jj10Var;
    }
}
