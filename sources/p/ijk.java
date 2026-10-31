package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ijk extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gw70 b;
    public final /* synthetic */ ljk c;
    public final /* synthetic */ tob1 d;
    public final /* synthetic */ tob1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ijk(gw70 gw70Var, ljk ljkVar, tob1 tob1Var, tob1 tob1Var2, byte b) {
        super(2);
        this.a = b;
        this.b = gw70Var;
        this.c = ljkVar;
        this.d = tob1Var;
        this.e = tob1Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    mod.b(oi7.a.a(this.b), apo.r(-875112400, new mzj(this.c, this.d, this.e), x340Var2), x340Var2, 56);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-1248484496, new ijk(this.b, this.c, this.d, this.e, (byte) 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
