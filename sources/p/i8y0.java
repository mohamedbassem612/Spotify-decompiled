package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i8y0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z72 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i8y0(z72 z72Var, byte b) {
        super(1);
        this.a = b;
        this.b = z72Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        z72 z72Var = this.b;
        switch (b) {
            case 0:
                return h5p1.r(((zwz0) z72Var.i).c(), yoi1.g(((xvo) z72Var.h).a(true)), ((iz31) z72Var.Y).c(), ((i5y0) z72Var.X).h(), new y8l(5, (lnm) null, (byte) 1));
            default:
                ((qtr) obj).b(new k8y0(z72Var, lnmVar, (byte) 0));
                return rih1.a;
        }
    }
}
