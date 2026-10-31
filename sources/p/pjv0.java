package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pjv0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yiv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pjv0(yiv0 yiv0Var, byte b) {
        super(2);
        this.a = b;
        this.b = yiv0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yiv0 yiv0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (yiv0Var.c != 1) {
                    x340Var2.i0(-478106724);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-478250874);
                    w0h1.a(irx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var2, irx.d | 48, 60);
                    x340Var2.r(false);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwo1.e(yiv0Var.c == 1 ? x0d.k(x340Var4, 1031790636, 2131960264, x340Var4, false) : x0d.k(x340Var4, 1031876909, 2131960265, x340Var4, false), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2046);
                }
                break;
        }
        return rih1Var;
    }
}
