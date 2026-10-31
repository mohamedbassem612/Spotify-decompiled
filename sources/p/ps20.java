package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ps20 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n811 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps20(n811 n811Var, byte b) {
        super(1);
        this.a = b;
        this.b = n811Var;
    }

    public final Object invoke(Object obj) {
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n811 n811Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                if (Math.abs(iIntValue - n811Var.a) >= 17 || (i = n811Var.a) == 0) {
                    n811Var.a = iIntValue;
                } else {
                    iIntValue = i;
                }
                return Integer.valueOf(iIntValue);
            case 1:
                n811Var.a = ((y9e1) obj).b.f;
                return rih1Var;
            default:
                n811Var.a = ((y9e1) obj).b.f;
                return rih1Var;
        }
    }
}
