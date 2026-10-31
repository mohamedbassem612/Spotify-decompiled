package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vm81 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ymk0 b;
    public final /* synthetic */ tm81 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vm81(ymk0 ymk0Var, tm81 tm81Var, byte b) {
        super(1);
        this.a = b;
        this.b = ymk0Var;
        this.c = tm81Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tm81 tm81Var = this.c;
        ymk0 ymk0Var = this.b;
        switch (b) {
            case 0:
                hma1 hma1Var = (hma1) obj;
                ymk0Var.getClass();
                hma1Var.b(ymk0.c(tm81Var, "impression_count"), ymk0Var.b.l(ymk0.c(tm81Var, "impression_count"), 0) + 1);
                if (ymk0Var.b(tm81Var) == null) {
                    hma1Var.c(ymk0.c(tm81Var, "first_impression"), ymk0Var.a.b());
                }
                break;
            default:
                ymk0Var.getClass();
                ((hma1) obj).b(ymk0.c(tm81Var, "interaction_count"), ymk0Var.b.l(ymk0.c(tm81Var, "interaction_count"), 0) + 1);
                break;
        }
        return rih1Var;
    }
}
