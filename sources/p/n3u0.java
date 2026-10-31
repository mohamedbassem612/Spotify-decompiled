package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n3u0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p3u0 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3u0(p3u0 p3u0Var, boolean z, byte b) {
        super(1);
        this.a = b;
        this.b = p3u0Var;
        this.c = z;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p3u0 p3u0Var = this.b;
        switch (b) {
            case 0:
                p3u0Var.h.N(p3u0Var.i, ((Number) obj).longValue(), p3u0Var.c.getDuration(), this.c);
                break;
            default:
                p3u0Var.h.n(p3u0Var.i, this.c, ((Number) obj).longValue());
                break;
        }
        return rih1Var;
    }
}
