package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g3u0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p3u0 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3u0(p3u0 p3u0Var, long j, byte b) {
        super(1);
        this.a = b;
        this.b = p3u0Var;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j = this.c;
        p3u0 p3u0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).longValue();
                p3u0Var.h.r(p3u0Var.i, j);
                break;
            default:
                ((Number) obj).longValue();
                p3u0Var.h.q(p3u0Var.i, j);
                break;
        }
        return rih1Var;
    }
}
