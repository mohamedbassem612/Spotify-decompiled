package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zuk1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qyk1 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zuk1(qyk1 qyk1Var, Function0 function0, Function0 function1) {
        super(2);
        this.b = qyk1Var;
        this.c = function0;
        this.d = function1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        qyk1 qyk1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pyk1 pyk1Var = qyk1Var.j;
                    if (u890.j(pyk1Var, myk1.a)) {
                        x340Var2.i0(476469353);
                        rc2.b(function0, x340Var2, 0);
                        x340Var2.r(false);
                    } else if (u890.j(pyk1Var, oyk1.a)) {
                        x340Var2.i0(476472765);
                        rc2.j(0, 1, x340Var2, null);
                        x340Var2.r(false);
                    } else {
                        if (!u890.j(pyk1Var, nyk1.a)) {
                            throw p3d1.k(x340Var2, 476466754, false);
                        }
                        x340Var2.i0(476475211);
                        rc2.h(0, 8, cwl1.o0(x340Var2, 2131957788), this.d, x340Var2, null, qyk1Var.e);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                rc2.c(qyk1Var, function0, this.d, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zuk1(qyk1 qyk1Var, Function0 function0, Function0 function1, int i) {
        super(2);
        this.b = qyk1Var;
        this.c = function0;
        this.d = function1;
    }
}
