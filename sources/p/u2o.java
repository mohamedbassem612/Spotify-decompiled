package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u2o extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w2o b;
    public final /* synthetic */ y2o c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2o(y2o y2oVar, w2o w2oVar) {
        super(2);
        this.a = (byte) 0;
        this.c = y2oVar;
        this.b = w2oVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y2o y2oVar = this.c;
        w2o w2oVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ev21 ev21Var = y2oVar.h;
                    if (ev21Var instanceof dv21) {
                        x340Var2.i0(-2042317924);
                        Object objT = x340Var2.T();
                        m4c m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = w2oVar.e.a();
                            x340Var2.s0(objT);
                        }
                        c8b c8bVar = (c8b) objT;
                        boolean zI = x340Var2.i(c8bVar) | x340Var2.i(w2oVar);
                        Object objT2 = x340Var2.T();
                        if (zI || objT2 == m4cVar) {
                            objT2 = new eum(c8bVar, w2oVar, null, (byte) 7);
                            x340Var2.s0(objT2);
                        }
                        qxd0.t(rih1Var, x340Var2, (vu30) objT2);
                        x340Var2.r(false);
                    } else if (ev21Var instanceof ev21) {
                        x340Var2.i0(1458152784);
                        w2oVar.c(ev21Var.a, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        if (ev21Var != null) {
                            throw p3d1.k(x340Var2, 1458136223, false);
                        }
                        x340Var2.i0(-2041842384);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    w2oVar.d.b(70, apo.r(-744850576, new u2o(y2oVar, w2oVar), x340Var4), x340Var4);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qsw.a(apo.r(-1685415504, new u2o(w2oVar, y2oVar, b2), x340Var6), x340Var6);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2o(w2o w2oVar, y2o y2oVar, byte b) {
        super(2);
        this.a = b;
        this.b = w2oVar;
        this.c = y2oVar;
    }
}
