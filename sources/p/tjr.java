package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tjr extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nhr0 b;
    public final /* synthetic */ ujr c;
    public final /* synthetic */ q3b1 d;
    public final /* synthetic */ cxb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tjr(nhr0 nhr0Var, ujr ujrVar, q3b1 q3b1Var, cxb cxbVar, byte b) {
        super(2);
        this.a = b;
        this.b = nhr0Var;
        this.c = ujrVar;
        this.d = q3b1Var;
        this.e = cxbVar;
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
                    rce0.a(cwl1.B(this.b.g()), apo.r(1804070769, new won(this.c, this.d, this.e, (byte) 6), x340Var2), x340Var2, 48);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nhr0 nhr0Var = this.b;
                    k2r0.a(nhr0Var, apo.r(-2049416640, new tjr(nhr0Var, this.c, this.d, this.e, (byte) 0), x340Var4), x340Var4, 48);
                }
                break;
        }
        return rih1Var;
    }
}
