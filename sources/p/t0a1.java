package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t0a1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xu30 b;
    public final /* synthetic */ ym90 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0a1(xu30 xu30Var, ym90 ym90Var, byte b) {
        super(2);
        this.a = b;
        this.b = xu30Var;
        this.c = ym90Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ym90 ym90Var = this.c;
        xu30 xu30Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    xu30Var.invoke(ym90Var, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    fbp1.l(48, apo.r(-1671762441, new xw91(xu30Var, ym90Var, (byte) 2), x340Var4), x340Var4, (qim0) null);
                }
                break;
        }
        return rih1Var;
    }
}
