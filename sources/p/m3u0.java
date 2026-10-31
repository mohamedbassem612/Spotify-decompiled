package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m3u0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p3u0 b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3u0(p3u0 p3u0Var, float f, byte b) {
        super(1);
        this.a = b;
        this.b = p3u0Var;
        this.c = f;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        p3u0 p3u0Var = this.b;
        switch (b) {
            case 0:
                p3u0Var.h.X(f, ((Number) obj).longValue(), p3u0Var.i);
                break;
            default:
                p3u0Var.h.G(f, ((Number) obj).longValue(), p3u0Var.i);
                break;
        }
        return rih1Var;
    }
}
