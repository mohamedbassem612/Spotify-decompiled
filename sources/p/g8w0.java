package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g8w0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h8w0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g8w0(h8w0 h8w0Var, byte b) {
        super(1);
        this.a = b;
        this.b = h8w0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        h8w0 h8w0Var = this.b;
        switch (b) {
            case 0:
                return h8w0Var.f;
            default:
                ((Number) obj).intValue();
                return ((h7l0) h8w0Var.e.b).b();
        }
    }
}
