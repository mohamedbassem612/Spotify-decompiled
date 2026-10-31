package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class db5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eb5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db5(eb5 eb5Var, byte b) {
        super(1);
        this.a = b;
        this.b = eb5Var;
    }

    public final Object invoke(Object obj) {
        long j;
        byte b = this.a;
        eb5 eb5Var = this.b;
        switch (b) {
            case 0:
                long jIntValue = ((Number) obj).intValue();
                return Integer.valueOf(((int) (eb5Var.i() >> 32)) - ((int) (eb5Var.h((jIntValue & 4294967295L) | (jIntValue << 32), eb5Var.i()) >> 32)));
            case 1:
                int iIntValue = ((Number) obj).intValue();
                long j2 = iIntValue;
                return Integer.valueOf((-((int) (eb5Var.h((j2 & 4294967295L) | (j2 << 32), eb5Var.i()) >> 32))) - iIntValue);
            case 2:
                long jIntValue2 = ((Number) obj).intValue();
                return Integer.valueOf(((int) (eb5Var.i() & 4294967295L)) - ((int) (eb5Var.h((jIntValue2 & 4294967295L) | (jIntValue2 << 32), eb5Var.i()) & 4294967295L)));
            case 3:
                int iIntValue2 = ((Number) obj).intValue();
                long j3 = iIntValue2;
                return Integer.valueOf((-((int) (eb5Var.h((j3 & 4294967295L) | (j3 << 32), eb5Var.i()) & 4294967295L))) - iIntValue2);
            case 4:
                int iIntValue3 = ((Number) obj).intValue();
                tob1 tob1Var = (tob1) eb5Var.e.g(eb5Var.a.d.getValue());
                long j4 = iIntValue3;
                return Integer.valueOf((-((int) (eb5Var.h((4294967295L & j4) | (j4 << 32), tob1Var != null ? ((yr80) tob1Var.getValue()).a : 0L) >> 32))) - iIntValue3);
            case 5:
                int iIntValue4 = ((Number) obj).intValue();
                tob1 tob1Var2 = (tob1) eb5Var.e.g(eb5Var.a.d.getValue());
                j = tob1Var2 != null ? ((yr80) tob1Var2.getValue()).a : 0L;
                long j5 = iIntValue4;
                return Integer.valueOf((-((int) (eb5Var.h((4294967295L & j5) | (j5 << 32), j) >> 32))) + ((int) (j >> 32)));
            case 6:
                int iIntValue5 = ((Number) obj).intValue();
                tob1 tob1Var3 = (tob1) eb5Var.e.g(eb5Var.a.d.getValue());
                long j6 = iIntValue5;
                return Integer.valueOf((-((int) (eb5Var.h((j6 & 4294967295L) | (j6 << 32), tob1Var3 != null ? ((yr80) tob1Var3.getValue()).a : 0L) & 4294967295L))) - iIntValue5);
            default:
                int iIntValue6 = ((Number) obj).intValue();
                tob1 tob1Var4 = (tob1) eb5Var.e.g(eb5Var.a.d.getValue());
                j = tob1Var4 != null ? ((yr80) tob1Var4.getValue()).a : 0L;
                long j7 = iIntValue6;
                return Integer.valueOf((-((int) (eb5Var.h((j7 & 4294967295L) | (j7 << 32), j) & 4294967295L))) + ((int) (j & 4294967295L)));
        }
    }
}
