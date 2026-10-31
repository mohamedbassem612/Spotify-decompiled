package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ro50 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gw70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ro50(gw70 gw70Var, byte b) {
        super(3);
        this.a = b;
        this.b = gw70Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gw70 gw70Var = this.b;
        switch (b) {
            case 0:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x340Var2.b0();
                } else {
                    mod.b(oi7.a.a(gw70Var), vu30Var, x340Var2, ((iIntValue << 3) & 112) | 8);
                }
                break;
            default:
                vu30 vu30Var2 = (vu30) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var3.i(vu30Var2) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x340Var4.b0();
                } else {
                    mod.b(oi7.a.a(gw70Var), vu30Var2, x340Var4, ((iIntValue2 << 3) & 112) | 8);
                }
                break;
        }
        return rih1Var;
    }
}
