package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kda1 extends hab0 implements dv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qba1 b;
    public final /* synthetic */ n8h1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kda1(qba1 qba1Var, n8h1 n8h1Var, byte b) {
        super(6);
        this.a = b;
        this.b = qba1Var;
        this.c = n8h1Var;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n8h1 n8h1Var = this.c;
        switch (b) {
            case 0:
                kba1 kba1Var = (kba1) obj;
                int iIntValue = ((Number) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                x340 x340Var = (b0k) obj5;
                int iIntValue2 = ((Number) obj6).intValue();
                int i = (iIntValue2 & 6) == 0 ? (x340Var.g(kba1Var) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i |= x340Var.h(zBooleanValue) ? 256 : 128;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 8339) != 8338)) {
                    x340Var2.b0();
                } else {
                    this.b.e(new oba1(kba1Var, iIntValue, zBooleanValue), (a1m0) n8h1Var, (qim0) null, x340Var2, 0);
                }
                break;
            default:
                kba1 kba1Var2 = (kba1) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                x340 x340Var3 = (b0k) obj5;
                int iIntValue4 = ((Number) obj6).intValue();
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (x340Var3.g(kba1Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                if ((iIntValue4 & 384) == 0) {
                    i2 |= x340Var3.h(zBooleanValue2) ? 256 : 128;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i2 & 1, (i2 & 8339) != 8338)) {
                    x340Var4.b0();
                } else {
                    this.b.e(new oba1(kba1Var2, iIntValue3, zBooleanValue2), (d1m0) n8h1Var, (qim0) null, x340Var4, 0);
                }
                break;
        }
        return rih1Var;
    }
}
