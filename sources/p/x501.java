package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x501 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w501 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x501(w501 w501Var, byte b) {
        super(3);
        this.a = b;
        this.b = w501Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        w501 w501Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else if (!w501Var.c) {
                    x340Var2.i0(2027860830);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(2027466820);
                    uwr uwrVar = cbx.a;
                    uwo1.e(cwl1.o0(x340Var2, 2131960860), u291.f(nim0.a, 1.0f), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var2, 1572912, 0, 1712);
                    x340Var2.r(false);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    String str = w501Var.b;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str, (qim0) null, cbx.d(x340Var4).d, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2042);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x340Var6.b0();
                } else {
                    String str2 = w501Var.a.b;
                    zic0 zic0Var = new zic0(1);
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str2, (qim0) null, cbx.d(x340Var6).g, cbx.a(x340Var6).b.a, (a0e1) null, (iu30) null, 0, false, zic0Var, 0, (qx8) null, x340Var6, 0, 0, 1778);
                }
                break;
        }
        return rih1Var;
    }
}
