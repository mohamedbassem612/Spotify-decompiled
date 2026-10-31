package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mba0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z72 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mba0(z72 z72Var, byte b) {
        super(1);
        this.a = b;
        this.b = z72Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        z72 z72Var = this.b;
        switch (b) {
            case 0:
                return (evz) ((iir) z72Var.g).c;
            default:
                ((qtr) obj).b(new skv(z72Var, (lnm) null, (byte) 14));
                return rih1.a;
        }
    }
}
