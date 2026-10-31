package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rcb1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z72 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rcb1(z72 z72Var, byte b) {
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
                return h5p1.s(((roc0) ((koc0) z72Var.g)).d(), (mr20) z72Var.X, ((rbt) z72Var.h).e, new td1(4, (lnm) null, (byte) 12));
            default:
                ((qtr) obj).b(new gz0((Object) z72Var, lnmVar, (byte) 29));
                return rih1.a;
        }
    }
}
