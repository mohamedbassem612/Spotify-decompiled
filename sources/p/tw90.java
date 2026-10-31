package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tw90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ lw90 b;
    public final /* synthetic */ y5a0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw90(lw90 lw90Var, y5a0 y5a0Var) {
        super(2);
        this.b = lw90Var;
        this.c = y5a0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y5a0 y5a0Var = this.c;
        lw90 lw90Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                acq0.c(lw90Var, y5a0Var, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    acq0.c(lw90Var, y5a0Var, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw90(lw90 lw90Var, y5a0 y5a0Var, int i) {
        super(2);
        this.b = lw90Var;
        this.c = y5a0Var;
    }
}
