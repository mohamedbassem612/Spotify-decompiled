package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i3u0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p3u0 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3u0(p3u0 p3u0Var, int i, byte b) {
        super(1);
        this.a = b;
        this.b = p3u0Var;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        p3u0 p3u0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).longValue();
                p3u0Var.h.s(p3u0Var.i, i);
                break;
            case 1:
                ((Number) obj).longValue();
                p3u0Var.h.u(p3u0Var.i, i);
                break;
            case 2:
                long jLongValue = ((Number) obj).longValue();
                lgy lgyVar = p3u0Var.h;
                m0u0 m0u0Var = p3u0Var.i;
                lgyVar.m(m0u0Var, i, jLongValue);
                lgyVar.k(m0u0Var, i != 1, jLongValue);
                break;
            default:
                p3u0Var.h.R(p3u0Var.i, i, ((Number) obj).longValue());
                break;
        }
        return rih1Var;
    }
}
