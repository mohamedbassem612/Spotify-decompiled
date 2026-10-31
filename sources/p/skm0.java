package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class skm0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qkm0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ skm0(qkm0 qkm0Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = qkm0Var;
        this.c = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                qkm0 qkm0Var = this.b;
                pkm0 pkm0Var = qkm0Var.b;
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int iC = l1d.C(pkm0Var.c);
                    if (iC == 0) {
                        x340Var2.i0(-1580525556);
                        boolean zG = x340Var2.g(iu30Var);
                        Object objT = x340Var2.T();
                        if (zG || objT == m4cVar) {
                            objT = new k2g0(iu30Var, (byte) 22);
                            x340Var2.s0(objT);
                        }
                        vu30 vu30Var = (vu30) objT;
                        boolean zG2 = x340Var2.g(iu30Var);
                        Object objT2 = x340Var2.T();
                        if (zG2 || objT2 == m4cVar) {
                            objT2 = new k2g0(iu30Var, (byte) 23);
                            x340Var2.s0(objT2);
                        }
                        up30.e(qkm0Var, vu30Var, (vu30) objT2, (qim0) null, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        if (iC != 1) {
                            throw p3d1.k(x340Var2, -1580527476, false);
                        }
                        x340Var2.i0(-1580501882);
                        boolean zG3 = x340Var2.g(iu30Var);
                        Object objT3 = x340Var2.T();
                        if (zG3 || objT3 == m4cVar) {
                            objT3 = new k2g0(iu30Var, (byte) 24);
                            x340Var2.s0(objT3);
                        }
                        e130.g(pkm0Var, (vu30) objT3, null, x340Var2, 0);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(-877621352, new skm0(this.b, iu30Var, b2), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
