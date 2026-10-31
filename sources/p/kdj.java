package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kdj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rf21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kdj(rf21 rf21Var, byte b) {
        super(2);
        this.a = b;
        this.b = rf21Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rf21 rf21Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    bsx bsxVar = bsx.c;
                    ksl kslVar = rf21Var.b;
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    w0h1.a(bsxVar, kslVar, u291.r(nim0.a, 24.0f), 0L, 0L, false, x340Var2, bsx.d, 56);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    String str = rf21Var.a;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str, (qim0) null, cbx.d(x340Var4).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2042);
                }
                break;
        }
        return rih1Var;
    }
}
