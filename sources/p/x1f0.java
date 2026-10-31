package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x1f0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vzg1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1f0(vzg1 vzg1Var, byte b) {
        super(2);
        this.a = b;
        this.b = vzg1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        pe11 pe11Var = pe11.d;
        vzg1 vzg1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (vzg1Var.d != pe11Var) {
                    x340Var2.i0(765503345);
                    w0h1.a(wrx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var2, wrx.d | 48, 60);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(765399216);
                    uwr uwrVar = cbx.a;
                    xto1.e((qim0) null, 0, cbx.a(x340Var2).c.a, 0L, x340Var2, 0, 11);
                    x340Var2.r(false);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    String strK = vzg1Var.d == pe11Var ? x0d.k(x340Var4, -1308795126, 2131957710, x340Var4, false) : x0d.k(x340Var4, -1308689230, 2131957709, x340Var4, false);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(strK, anm1.N("login_options_card_refresh_button_text", nim0Var), cbx.d(x340Var4).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2040);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else if (vzg1Var.d != pe11Var) {
                    x340Var6.i0(-1122308119);
                    w0h1.a(wrx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var6, wrx.d | 48, 60);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(-1122412248);
                    uwr uwrVar3 = cbx.a;
                    xto1.e((qim0) null, 0, cbx.a(x340Var6).c.a, 0L, x340Var6, 0, 11);
                    x340Var6.r(false);
                }
                break;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    String strK2 = vzg1Var.d == pe11Var ? x0d.k(x340Var8, -635299710, 2131957710, x340Var8, false) : x0d.k(x340Var8, -635193814, 2131957709, x340Var8, false);
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(strK2, anm1.N("login_options_card_refresh_button_text", nim0Var), cbx.d(x340Var8).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2040);
                }
                break;
        }
        return rih1Var;
    }
}
