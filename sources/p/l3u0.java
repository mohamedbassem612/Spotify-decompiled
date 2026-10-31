package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l3u0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p3u0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ jgc1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3u0(p3u0 p3u0Var, int i, jgc1 jgc1Var, byte b) {
        super(1);
        this.a = b;
        this.b = p3u0Var;
        this.c = i;
        this.d = jgc1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jgc1 jgc1Var = this.d;
        int i = this.c;
        p3u0 p3u0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).longValue();
                p3u0Var.h.B(p3u0Var.i, i, jgc1Var);
                break;
            default:
                ((Number) obj).longValue();
                p3u0Var.h.B(p3u0Var.i, i, jgc1Var);
                break;
        }
        return rih1Var;
    }
}
