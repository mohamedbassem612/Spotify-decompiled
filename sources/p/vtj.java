package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vtj extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ rzn1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtj(rzn1 rzn1Var) {
        super(2);
        this.b = rzn1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rzn1 rzn1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    dro.a(rzn1Var, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                dro.a(rzn1Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtj(rzn1 rzn1Var, int i) {
        super(2);
        this.b = rzn1Var;
    }
}
