package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class noi0 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gw70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ noi0(gw70 gw70Var, byte b) {
        super(5);
        this.a = b;
        this.b = gw70Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        gw70 gw70Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(gw70Var), apo.r(1083355168, new moi0((joi0) obj2, (iu30) obj3, (byte) 1), b0kVar), b0kVar, 56);
                return rih1Var;
            default:
                ylr0 ylr0Var = (zlr0) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if (ylr0Var.equals(xlr0.a)) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-233578174);
                    x340Var2.r(false);
                } else {
                    if (!(ylr0Var instanceof ylr0)) {
                        throw p3d1.k(x340Var, -146083057, false);
                    }
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-233544229);
                    ylr0 ylr0Var2 = ylr0Var;
                    if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var3.g(iu30Var)) && (iIntValue & 384) != 256) {
                        z = false;
                    }
                    Object objT = x340Var3.T();
                    if (z || objT == fkj0.X) {
                        objT = new dgq0(iu30Var, (byte) 16);
                        x340Var3.s0(objT);
                    }
                    b3o1.i(ylr0Var2, gw70Var, (Function0) objT, x340Var3, (iIntValue >> 3) & 14);
                    x340Var3.r(false);
                }
                return rih1Var;
        }
    }
}
