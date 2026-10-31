package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g421 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j421 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g421(j421 j421Var, byte b) {
        super(2);
        this.a = b;
        this.b = j421Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j421 j421Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ven0 ven0VarK = f4p1.k(j421Var.i1().g, (iac0) null, x340Var2, 7);
                    iuk1 iuk1Var = (iuk1) ven0VarK.getValue();
                    if (iuk1Var instanceof guk1) {
                        x340Var2.i0(-1506285253);
                        r6p1.j((iuk1) ven0VarK.getValue(), (qim0) null, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        if (!(iuk1Var instanceof huk1) && !(iuk1Var instanceof fuk1)) {
                            throw p3d1.k(x340Var2, -1506286612, false);
                        }
                        x340Var2.i0(549900986);
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
                    nyx.a(2, (wux) null, apo.r(-1811621274, new g421(j421Var, b2), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
