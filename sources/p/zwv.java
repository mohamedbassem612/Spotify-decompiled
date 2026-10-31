package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zwv extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ bxv b;
    public final /* synthetic */ eyv c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwv(bxv bxvVar, eyv eyvVar, iu30 iu30Var) {
        super(2);
        this.b = bxvVar;
        this.c = eyvVar;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        eyv eyvVar = this.c;
        bxv bxvVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                bxvVar.b(eyvVar, iu30Var, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    bxvVar.b(eyvVar, iu30Var, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwv(bxv bxvVar, eyv eyvVar, iu30 iu30Var, int i) {
        super(2);
        this.b = bxvVar;
        this.c = eyvVar;
        this.d = iu30Var;
    }
}
