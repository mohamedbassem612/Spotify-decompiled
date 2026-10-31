package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fyk1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hyk1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fyk1(hyk1 hyk1Var, byte b) {
        super(4);
        this.a = b;
        this.b = hyk1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hyk1 hyk1Var = this.b;
        switch (b) {
            case 0:
                vwv0 vwv0Var = (vwv0) obj;
                String str = (String) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                int i = (iIntValue & 6) == 0 ? iIntValue | (x340Var.g(vwv0Var) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= x340Var.g(str) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    hyk1Var.c(vwv0Var, str, x340Var2, i & 126);
                }
                break;
            default:
                eyk1 eyk1Var = (eyk1) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var3 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? x340Var3.g(eyk1Var) : x340Var3.i(eyk1Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= x340Var3.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(1872734426, new pej1(eyk1Var, hyk1Var, iu30Var, (byte) 12), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
