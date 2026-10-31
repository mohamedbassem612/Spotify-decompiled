package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yqr extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ err b;
    public final /* synthetic */ oyn c;
    public final /* synthetic */ tn30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yqr(err errVar, oyn oynVar, tn30 tn30Var, byte b) {
        super(2);
        this.a = b;
        this.b = errVar;
        this.c = oynVar;
        this.d = tn30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tn30 tn30Var = this.d;
        oyn oynVar = this.c;
        err errVar = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    mod.b(oi7.a.a(errVar.b), apo.r(756684523, new xqr(oynVar, tn30Var, (byte) 1), x340Var2), x340Var2, 56);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    qsw.a(apo.r(1123906475, new yqr(errVar, oynVar, tn30Var, objArr == true ? 1 : 0), x340Var4), x340Var4);
                }
                break;
        }
        return rih1Var;
    }
}
