package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xvb extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ swb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xvb(swb swbVar, byte b) {
        super(2);
        this.a = b;
        this.b = swbVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        swb swbVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String str = swbVar.f;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).h, 0L, new a0e1(3), (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var2, 12582912, 0, 1640);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    String str2 = swbVar.i;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str2, u291.f(nim0Var, 1.0f), cbx.d(x340Var4).h, 0L, new a0e1(3), (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var4, 12582912, 0, 1640);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    String str3 = swbVar.f;
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str3, (qim0) null, cbx.d(x340Var6).h, 0L, new a0e1(3), (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var6, 12582912, 0, 1642);
                }
                break;
        }
        return rih1Var;
    }
}
