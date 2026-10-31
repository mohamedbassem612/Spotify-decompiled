package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class msb1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qsb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ msb1(qsb1 qsb1Var, byte b) {
        super(1);
        this.a = b;
        this.b = qsb1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qsb1 qsb1Var = this.b;
        switch (b) {
            case 0:
                return qsb1Var.g((ksb1) obj, null);
            default:
                qtr qtrVar = (qtr) obj;
                qtrVar.b(new k8y0(qsb1Var, (lnm) null, (byte) 20));
                qtrVar.d(cgb1.P0, new wh91(qsb1Var, (byte) 25));
                return rih1.a;
        }
    }
}
