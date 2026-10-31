package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h330 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j330 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h330(j330 j330Var, byte b) {
        super(1);
        this.a = b;
        this.b = j330Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        j330 j330Var = this.b;
        switch (b) {
            case 0:
                return d3p1.H(j330Var.b, j330Var.c, (p330) obj);
            default:
                ((qtr) obj).b(new u08(j330Var, (lnm) null, (byte) 6));
                return rih1.a;
        }
    }
}
