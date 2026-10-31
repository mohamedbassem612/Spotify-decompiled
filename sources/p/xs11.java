package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xs11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ unb1 b;
    public final /* synthetic */ ys11 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xs11(unb1 unb1Var, ys11 ys11Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = unb1Var;
        this.c = ys11Var;
        this.d = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 n601Var = this.d;
        ys11 ys11Var = this.c;
        unb1 unb1Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                int i = ys11Var.p1;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (unb1Var instanceof jmb1) {
                    x340Var2.i0(-790342604);
                    jmb1 jmb1Var = (jmb1) unb1Var;
                    if (u890.j(jmb1Var.i, k6u.a)) {
                        n601Var = new n601(n601Var, (byte) 8);
                    }
                    ys11Var.i(jmb1Var, n601Var, x340Var2, 0);
                    x340Var2.r(false);
                } else if (unb1Var instanceof tlb1) {
                    x340Var2.i0(-790339849);
                    ys11Var.j(i, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    if (!(unb1Var instanceof inb1)) {
                        throw p3d1.k(x340Var2, -790343840, false);
                    }
                    x340Var2.i0(-790337929);
                    ys11Var.j(i, x340Var2, 0);
                    x340Var2.r(false);
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(2122080251, new xs11(unb1Var, ys11Var, n601Var, b2), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
