package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v2o extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cir0 b;
    public final /* synthetic */ w2o c;
    public final /* synthetic */ y2o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2o(cir0 cir0Var, w2o w2oVar, y2o y2oVar, byte b) {
        super(2);
        this.a = b;
        this.b = cir0Var;
        this.c = w2oVar;
        this.d = y2oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y2o y2oVar = this.d;
        w2o w2oVar = this.c;
        cir0 cir0Var = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    rce0.a(cwl1.B(cir0Var.g()), apo.r(-595642193, new u2o(w2oVar, y2oVar, (byte) 2), x340Var2), x340Var2, 48);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    k2r0.a(cir0Var, apo.r(732806334, new v2o(cir0Var, w2oVar, y2oVar, objArr == true ? 1 : 0), x340Var4), x340Var4, 48);
                }
                break;
        }
        return rih1Var;
    }
}
