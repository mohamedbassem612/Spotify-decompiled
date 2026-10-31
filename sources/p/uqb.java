package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uqb extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ arb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uqb(arb arbVar, byte b) {
        super(2);
        this.a = b;
        this.b = arbVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        arb arbVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    w0h1.a(arbVar.d, isl.a, (qim0) null, 0L, 0L, false, x340Var2, 56, 60);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    w0h1.a(arbVar.d, isl.a, (qim0) null, 0L, 0L, false, x340Var4, 56, 60);
                }
                break;
        }
        return rih1Var;
    }
}
