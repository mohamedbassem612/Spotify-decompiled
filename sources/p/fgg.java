package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fgg extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ggg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgg(ggg gggVar) {
        super(2);
        this.b = gggVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ggg gggVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean state = gggVar.getState();
                    bby bbyVarQ = xa4.q();
                    era eraVar = een.P0;
                    fq7.g(state, (qim0) null, bbyVarQ.a(xay.b(irn1.o0(300, 0, (dlv) null, 6), eraVar, (iu30) null, 12)), xa4.r().a(xay.i(irn1.o0(300, 0, (dlv) null, 6), eraVar, (iu30) null, 12)), (String) null, apo.r(-1350253801, new dwd(gggVar, (byte) 28), x340Var2), x340Var2, 196608, 18);
                }
                break;
            default:
                ((Number) obj2).intValue();
                gggVar.a((b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgg(ggg gggVar, int i) {
        super(2);
        this.b = gggVar;
    }
}
