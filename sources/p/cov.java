package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cov extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cov(cm0 cm0Var, byte b) {
        super(1);
        this.a = b;
        this.b = cm0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        cm0 cm0Var = this.b;
        switch (b) {
            case 0:
                return h5p1.r((vvu) cm0Var.t, (vvu) cm0Var.i, ((roc0) ((koc0) cm0Var.d)).d(), ((mnk0) cm0Var.f).a, new k1(cm0Var, (lnm) null, (byte) 11));
            default:
                ((qtr) obj).b(new gz0((Object) cm0Var, lnmVar, (byte) 10));
                return rih1.a;
        }
    }
}
