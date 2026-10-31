package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i8a1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j8a1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i8a1(j8a1 j8a1Var, byte b) {
        super(1);
        this.a = b;
        this.b = j8a1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        j8a1 j8a1Var = this.b;
        switch (b) {
            case 0:
                return new cly0(d3p1.F(j8a1Var.a, j8a1Var.c, (f8a1) obj), (byte) 9);
            default:
                ((qtr) obj).b(new k8y0(j8a1Var, (lnm) null, (byte) 17));
                return rih1.a;
        }
    }
}
