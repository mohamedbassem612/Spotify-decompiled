package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tqb extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ crb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tqb(crb crbVar, byte b) {
        super(2);
        this.a = b;
        this.b = crbVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        crb crbVar = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    eqr0.b(0, 2, crbVar.getLabel(), x340Var2, (qim0) null);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    b3o1.f(cbx.d(x340Var4).k, apo.r(1288082059, new tqb(crbVar, b2), x340Var4), x340Var4, 48);
                }
                break;
        }
        return rih1Var;
    }
}
