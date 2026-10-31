package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v6g0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z6g0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v6g0(z6g0 z6g0Var, byte b) {
        super(4);
        this.a = b;
        this.b = z6g0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        z6g0 z6g0Var = this.b;
        switch (b) {
            case 0:
                r6g0 r6g0Var = (r6g0) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                int i = (iIntValue & 6) == 0 ? iIntValue | (x340Var.g(r6g0Var) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= x340Var.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    z6g0Var.c(iu30Var, apo.r(-2025759824, new t6g0(z6g0Var, r6g0Var, iu30Var, (byte) 2), x340Var2), x340Var2, ((i >> 3) & 14) | 48);
                }
                break;
            default:
                r6g0 r6g0Var2 = (r6g0) obj;
                iu30 iu30Var2 = (iu30) obj2;
                x340 x340Var3 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (x340Var3.g(r6g0Var2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= x340Var3.i(iu30Var2) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    x340Var4.b0();
                } else {
                    z6g0Var.c(iu30Var2, apo.r(-1302469391, new t6g0(z6g0Var, r6g0Var2, iu30Var2, (byte) 3), x340Var4), x340Var4, ((i2 >> 3) & 14) | 48);
                }
                break;
        }
        return rih1Var;
    }
}
