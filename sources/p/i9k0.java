package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i9k0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j9k0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i9k0(j9k0 j9k0Var, byte b) {
        super(2);
        this.a = b;
        this.b = j9k0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j9k0 j9k0Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l9k0 l9k0Var = j9k0Var.b;
                    String str = l9k0Var.a;
                    a9k0 a9k0Var = l9k0Var.b;
                    if (a9k0Var instanceof x8k0) {
                        x340Var2.i0(-1368039323);
                        otw.c((maa) j9k0Var.c.get(), new yaj0(str), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else if (a9k0Var instanceof y8k0) {
                        x340Var2.i0(540657030);
                        Object objT = x340Var2.T();
                        m4c m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = qxd0.M(o6x.a, x340Var2);
                            x340Var2.s0(objT);
                        }
                        c9n c9nVar = (c9n) objT;
                        Object objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            ysp yspVar = j9k0Var.d;
                            loi0 loi0Var = new loi0(c9nVar, j9k0Var, (byte) 9);
                            yspVar.getClass();
                            fej0 fej0Var = new fej0(loi0Var);
                            x340Var2.s0(fej0Var);
                            objT2 = fej0Var;
                        }
                        otw.c((fej0) objT2, new dej0(str), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else {
                        if (!(a9k0Var instanceof z8k0)) {
                            throw p3d1.k(x340Var2, -1368040503, false);
                        }
                        x340Var2.i0(-1367998415);
                        otw.c((maa) j9k0Var.e.get(), new xej0(str), (qim0) null, (ipb1) null, x340Var2, 0, 12);
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
                    nyx.a(2, (wux) null, apo.r(-1659522278, new i9k0(j9k0Var, b2), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
