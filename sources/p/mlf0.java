package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mlf0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mlf0(boolean z, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        long jA;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                y9e1 y9e1Var = (y9e1) obj;
                if (z) {
                    ven0Var.setValue(y9e1Var);
                }
                break;
            default:
                elb0 elb0Var = (elb0) obj;
                if (z) {
                    elb0 elb0VarJ = elb0Var.J();
                    int iB = elb0VarJ != null ? (int) (elb0VarJ.b() >> 32) : 0;
                    n511 n511VarL = nho1.l(elb0Var);
                    jA = (((long) Float.floatToRawIntBits(iB - n511VarL.c)) << 32) | (((long) Float.floatToRawIntBits(n511VarL.b)) & 4294967295L);
                } else {
                    jA = nho1.A(elb0Var);
                }
                ven0Var.setValue(new qr80(dm5.c0(jA)));
                break;
        }
        return rih1Var;
    }
}
