package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nq2 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o811 b;
    public final /* synthetic */ o811 c;
    public final /* synthetic */ nsw0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nq2(o811 o811Var, o811 o811Var2, nsw0 nsw0Var, byte b) {
        super(1);
        this.a = b;
        this.b = o811Var;
        this.c = o811Var2;
        this.d = nsw0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        psw0 psw0Var = this.d;
        o811 o811Var = this.b;
        o811 o811Var2 = this.c;
        switch (b) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                long j = o811Var.a;
                if (j < 0) {
                    o811Var.a = jLongValue;
                    o811Var2.a = jLongValue;
                } else if (jLongValue - o811Var2.a >= 66666667) {
                    psw0Var.setValue(Float.valueOf((jLongValue - j) / 1.0E9f));
                    o811Var2.a = jLongValue;
                }
                break;
            default:
                long jLongValue2 = ((Number) obj).longValue();
                if (o811Var.a == 0) {
                    o811Var.a = jLongValue2;
                    o811Var2.a = jLongValue2;
                } else if (jLongValue2 - o811Var2.a >= 66666667) {
                    psw0 psw0Var2 = psw0Var;
                    psw0Var2.setValue(Float.valueOf((((jLongValue2 - o811Var.a) / 1.0E9f) * 1.5f) + ((Number) psw0Var2.a.getValue()).floatValue()));
                    o811Var.a = jLongValue2;
                    o811Var2.a = jLongValue2;
                }
                break;
        }
        return rih1Var;
    }
}
