package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hmm extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cp41 b;
    public final /* synthetic */ wet0 c;
    public final /* synthetic */ odh0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hmm(cp41 cp41Var, wet0 wet0Var, odh0 odh0Var, byte b) {
        super(2);
        this.a = b;
        this.b = cp41Var;
        this.c = wet0Var;
        this.d = odh0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        odh0 odh0Var = this.d;
        wet0 wet0Var = this.c;
        rih1 rih1Var = rih1.a;
        cp41 cp41Var = this.b;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    a6o1.b(cp41Var.a, cp41Var.b, this.c, this.d, (qim0) null, x340Var2, 4608);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(0, (wux) null, apo.r(294091206, new hmm(cp41Var, wet0Var, odh0Var, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 3072, 7);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    qsw.a(apo.r(1165361465, new hmm(cp41Var, wet0Var, odh0Var, b2), x340Var6), x340Var6);
                }
                break;
        }
        return rih1Var;
    }
}
