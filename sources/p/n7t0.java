package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n7t0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p7t0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7t0(p7t0 p7t0Var, byte b) {
        super(2);
        this.a = b;
        this.b = p7t0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        p7t0 p7t0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String str = p7t0Var.b;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, anm1.N("txt_badge", uyn1.y(dug.f(nim0Var, cbx.a(x340Var2).a.c, er31.d(8.0f, 0.0f, 8.0f, 0.0f, 10)), 16.0f, 4.0f)), cbx.d(x340Var2).k, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    String str2 = p7t0Var.e;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str2, anm1.N("txt_plan", uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 8.0f, 7)), cbx.d(x340Var4).d, cbx.a(x340Var4).a.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2032);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    String str3 = p7t0Var.i;
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str3, u291.f(nim0Var, 1.0f), cbx.d(x340Var6).h, 0L, new a0e1(3), (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var6, 12582912, 0, 1640);
                }
                break;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    String str4 = p7t0Var.k;
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(str4, u291.f(nim0Var, 1.0f), cbx.d(x340Var8).h, 0L, new a0e1(3), (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var8, 12582912, 0, 1640);
                }
                break;
        }
        return rih1Var;
    }
}
