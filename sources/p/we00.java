package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class we00 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gw70 b;
    public final /* synthetic */ xe00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we00(gw70 gw70Var, xe00 xe00Var, byte b) {
        super(2);
        this.a = b;
        this.b = gw70Var;
        this.c = xe00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xe00 xe00Var = this.c;
        gw70 gw70Var = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    mod.b(oi7.a.a(gw70Var), apo.r(1006002846, new hzw(xe00Var, (byte) 18), x340Var2), x340Var2, 56);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-1677935138, new we00(gw70Var, xe00Var, objArr == true ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
