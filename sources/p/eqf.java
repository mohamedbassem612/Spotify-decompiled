package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eqf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bmh1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eqf(bmh1 bmh1Var, byte b) {
        super(1);
        this.a = b;
        this.b = bmh1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bmh1 bmh1Var = this.b;
        switch (b) {
            case 0:
                return new rm(bmh1Var, (byte) 19);
            case 1:
                return new qr80(((long) jch0.U(bmh1Var.d.s())) << 32);
            default:
                hav0 hav0Var = (hav0) obj;
                bmh1Var.a(Float.intBitsToFloat((int) (p8p1.B(hav0Var, false) >> 32)));
                hav0Var.a();
                return rih1.a;
        }
    }
}
