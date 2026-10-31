package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ee0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fe0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ee0(fe0 fe0Var, byte b) {
        super(1);
        this.a = b;
        this.b = fe0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fe0 fe0Var = this.b;
        switch (b) {
            case 0:
                de0 de0Var = fe0Var.i;
                mma0 mma0Var = fe0.j[2];
                if (((z7a) ((sgp0) de0Var).a) != null) {
                    fe0Var.a((z7a) null);
                    ilh1 ilh1Var = fe0Var.c;
                    ((bxn0) ilh1Var.c).c();
                    ((o2b1) ilh1Var.b).i("com.spotify.music.internal.waze.LAUNCH");
                }
                break;
            default:
                de0 de0Var2 = fe0Var.i;
                mma0 mma0Var2 = fe0.j[2];
                if (((z7a) ((sgp0) de0Var2).a) != null) {
                    fe0Var.a((z7a) null);
                    bih1 bih1Var = fe0Var.e;
                    d341 d341Var = (d341) bih1Var.b;
                    d341Var.a.onNext(new jfl1(1, 0, null, null, null, 126));
                    ((bxn0) bih1Var.c).b();
                }
                break;
        }
        return rih1Var;
    }
}
