package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class di81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ci81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ di81(ci81 ci81Var, byte b) {
        super(2);
        this.a = b;
        this.b = ci81Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ci81 ci81Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    w0h1.a(ci81Var.a, isl.a, (qim0) null, 0L, 0L, false, x340Var2, 56, 60);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    x340Var4.i0(1452044545);
                    String strO0 = cwl1.o0(x340Var4, ci81Var.b.intValue());
                    x340Var4.r(false);
                    uwo1.e(strO0, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var4, 0, 0, 1726);
                }
                break;
        }
        return rih1Var;
    }
}
