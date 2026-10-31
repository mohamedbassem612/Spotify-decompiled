package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lsq0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ osq0 b;
    public final /* synthetic */ wsq0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsq0(osq0 osq0Var, wsq0 wsq0Var) {
        super(2);
        this.b = osq0Var;
        this.c = wsq0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wsq0 wsq0Var = this.c;
        osq0 osq0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                osq0Var.i(wsq0Var, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    osq0Var.i(wsq0Var, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsq0(osq0 osq0Var, wsq0 wsq0Var, int i) {
        super(2);
        this.b = osq0Var;
        this.c = wsq0Var;
    }
}
