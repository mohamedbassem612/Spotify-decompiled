package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ydl extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h9l0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ydl(h9l0 h9l0Var, byte b) {
        super(1);
        this.a = b;
        this.b = h9l0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        h9l0 h9l0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return h9l0Var.b();
            default:
                return new h3h1(new ydl(h9l0Var, (byte) 0));
        }
    }
}
