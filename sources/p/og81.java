package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class og81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ zg81 b;
    public final /* synthetic */ ug81 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og81(zg81 zg81Var, ug81 ug81Var) {
        super(2);
        this.b = zg81Var;
        this.c = ug81Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ug81 ug81Var = this.c;
        zg81 zg81Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                zg81Var.h(ug81Var, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    zg81Var.h(ug81Var, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og81(zg81 zg81Var, ug81 ug81Var, int i) {
        super(2);
        this.b = zg81Var;
        this.c = ug81Var;
    }
}
