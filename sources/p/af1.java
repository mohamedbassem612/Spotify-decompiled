package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class af1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yg1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af1(yg1 yg1Var, byte b) {
        super(2);
        this.a = b;
        this.b = yg1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        yg1 yg1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String str = yg1Var.e.c.c;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).h, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2024);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    String str2 = yg1Var.e.c.c;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str2, (qim0) null, cbx.d(x340Var4).h, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2026);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    w0h1.a(xxq0.d(yg1Var.a), isl.a, u291.d(nim0Var, 1.0f), 0L, 0L, false, x340Var6, 56, 56);
                }
                break;
        }
        return rih1Var;
    }
}
