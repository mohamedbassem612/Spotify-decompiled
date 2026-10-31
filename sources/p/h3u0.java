package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h3u0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p3u0 b;
    public final /* synthetic */ ie30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3u0(p3u0 p3u0Var, ie30 ie30Var, byte b) {
        super(1);
        this.a = b;
        this.b = p3u0Var;
        this.c = ie30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ie30 ie30Var = this.c;
        p3u0 p3u0Var = this.b;
        switch (b) {
            case 0:
                p3u0Var.h.U(p3u0Var.i, ie30Var, ((Number) obj).longValue());
                break;
            case 1:
                p3u0Var.h.l(p3u0Var.i, ie30Var, ((Number) obj).longValue());
                break;
            case 2:
                p3u0Var.h.U(p3u0Var.i, ie30Var, ((Number) obj).longValue());
                break;
            default:
                p3u0Var.h.l(p3u0Var.i, ie30Var, ((Number) obj).longValue());
                break;
        }
        return rih1Var;
    }
}
