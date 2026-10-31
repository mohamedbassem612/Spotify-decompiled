package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nsr extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ atr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nsr(atr atrVar, byte b) {
        super(2);
        this.a = b;
        this.b = atrVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        atr atrVar = this.b;
        boolean z = false;
        byte b2 = 2;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    aak0 aak0Var = (aak0) atrVar.h.getValue();
                    if (aak0Var == null) {
                        x340Var2.i0(-132789955);
                    } else {
                        x340Var2.i0(-132789954);
                        g2p1.s(aak0Var, x340Var2, 0);
                    }
                    x340Var2.r(false);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(1911689219, new nsr(atrVar, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    wkt0.a((zkt0) atrVar.g.getValue(), (qim0) null, (ksl) null, 0L, false, x340Var6, 0, 30);
                }
                break;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(15784620, new nsr(atrVar, b2), x340Var8), x340Var8, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
