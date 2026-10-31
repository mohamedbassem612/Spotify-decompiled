package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vs9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bqk0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vs9(bqk0 bqk0Var, byte b) {
        super(1);
        this.a = b;
        this.b = bqk0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bqk0 bqk0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return bqk0Var.b();
            default:
                return new h3h1(new vs9(bqk0Var, (byte) 0));
        }
    }
}
