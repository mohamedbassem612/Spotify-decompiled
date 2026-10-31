package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kg7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mg7 b;
    public final /* synthetic */ tm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg7(tm tmVar, mg7 mg7Var) {
        super(2);
        this.a = (byte) 0;
        this.c = tmVar;
        this.b = mg7Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        tm tmVar = this.c;
        rih1 rih1Var = rih1.a;
        mg7 mg7Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    otw.c(this.c, mg7Var.P0.getValue(), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    qsw.c(new obk1(mg7Var.g), apo.r(1020077547, new kg7(tmVar, mg7Var), x340Var4), x340Var4, 48);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(1766425610, new kg7(mg7Var, tmVar, b2), x340Var6), x340Var6, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg7(mg7 mg7Var, tm tmVar, byte b) {
        super(2);
        this.a = b;
        this.b = mg7Var;
        this.c = tmVar;
    }
}
