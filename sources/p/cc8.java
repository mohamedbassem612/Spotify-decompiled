package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cc8 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lc7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc8(lc7 lc7Var, byte b) {
        super(2);
        this.a = b;
        this.b = lc7Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lc7 lc7Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwo1.e(xcg1.i(cwl1.o0(x340Var2, 2131952479), " • ", ((ub8) lc7Var.i).a), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1726);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    gaz gazVar = (gaz) lc7Var.i;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var4, 0);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, nim0.a);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(hmb0.t1);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(mbhVarA, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    String str = gazVar.b;
                    if (str == null || ihc1.y0(str)) {
                        x340Var4.i0(1889023551);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(1888781131);
                        uwo1.e(gazVar.b, (qim0) null, cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var4, 0, 0, 1714);
                        x340Var4.r(false);
                    }
                    if (gazVar.c != null) {
                        x340Var4.i0(1889074422);
                        aqo1.c(lc7Var.a.g, lc7Var.g, apo.r(-424462820, new o8x(gazVar, (byte) 12), x340Var4), x340Var4, 384);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(1889452095);
                        x340Var4.r(false);
                    }
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uwo1.e(((gaz) lc7Var.i).a, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var6, 0, 0, 1726);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    aqo1.c(((g) lc7Var.a).g, lc7Var.g, apo.r(-602794562, new e9f1(lc7Var, (byte) 5), x340Var8), x340Var8, 384);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            default:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    fc11.a(((cyf1) lc7Var.i).c, (qim0) null, (hcx) null, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var10, 8, 510);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
        }
    }
}
