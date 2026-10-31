package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tj81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uj81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tj81(uj81 uj81Var, byte b) {
        super(2);
        this.a = b;
        this.b = uj81Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uj81 uj81Var = this.b;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    kg0 kg0Var = uj81Var.I1;
                    if (kg0Var == null) {
                        u890.C("zeroNavigator");
                        throw null;
                    }
                    cd71 cd71Var = uj81Var.H1;
                    if (cd71Var == null) {
                        u890.C("shareParentalConsent");
                        throw null;
                    }
                    z710 z710Var = uj81Var.M1;
                    if (z710Var == null) {
                        u890.C("externalNavigator");
                        throw null;
                    }
                    wj81 wj81Var = uj81Var.N1;
                    if (wj81Var == null) {
                        u890.C("logger");
                        throw null;
                    }
                    b9p1.l(kg0Var, cd71Var, z710Var, wj81Var, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    kiv kivVar = oi7.a;
                    gw70 gw70Var = uj81Var.G1;
                    if (gw70Var == null) {
                        u890.C("imageLoader");
                        throw null;
                    }
                    mod.b(kivVar.a(gw70Var), apo.r(39342006, new tj81(uj81Var, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 56);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(-406516618, new tj81(uj81Var, b2), x340Var6), x340Var6, 3078, 6);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
