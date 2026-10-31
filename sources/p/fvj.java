package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fvj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cir0 b;
    public final /* synthetic */ hvj c;
    public final /* synthetic */ j2i d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fvj(cir0 cir0Var, hvj hvjVar, j2i j2iVar, Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = cir0Var;
        this.c = hvjVar;
        this.d = j2iVar;
        this.e = obj;
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
                    rce0.a(cwl1.B(this.b.g()), apo.r(-102230605, new evj(this.c, this.d, this.e, (byte) 1), x340Var2), x340Var2, 48);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    cir0 cir0Var = this.b;
                    k2r0.a(cir0Var, apo.r(1869029570, new fvj(cir0Var, this.c, this.d, this.e, (byte) 0), x340Var4), x340Var4, 48);
                }
                break;
        }
        return rih1Var;
    }
}
