package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hi6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ rk41 b;
    public final /* synthetic */ ji6 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi6(ji6 ji6Var, rk41 rk41Var, iu30 iu30Var) {
        super(1);
        this.c = ji6Var;
        this.b = rk41Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        ji6 ji6Var = this.c;
        rk41 rk41Var = this.b;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                wh6 wh6Var = (wh6) ji6Var.b;
                b261.n(e261Var, wh6Var.m);
                b261.x(e261Var, 0);
                if (!rk41Var.a) {
                    b261.g(e261Var, wh6Var.n, new ge3(iu30Var, (byte) 12));
                }
                break;
            default:
                e261 e261Var2 = (e261) obj;
                b261.x(e261Var2, 0);
                if (!rk41Var.a) {
                    b261.g(e261Var2, ((wh6) ji6Var.b).n, new ge3(iu30Var, (byte) 13));
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi6(rk41 rk41Var, ji6 ji6Var, iu30 iu30Var) {
        super(1);
        this.b = rk41Var;
        this.c = ji6Var;
        this.d = iu30Var;
    }
}
