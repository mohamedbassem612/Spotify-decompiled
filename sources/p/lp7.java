package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lp7 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tk90 b;
    public final /* synthetic */ hwq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lp7(tk90 tk90Var, hwq hwqVar, byte b) {
        super(3);
        this.a = b;
        this.b = tk90Var;
        this.c = hwqVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hwq hwqVar = this.c;
        tk90 tk90Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    tk90Var.a(hwqVar, x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    tk90Var.a(hwqVar, x340Var4, 0);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x340Var6.b0();
                } else {
                    tk90Var.a(hwqVar, x340Var6, 0);
                }
                break;
        }
        return rih1Var;
    }
}
