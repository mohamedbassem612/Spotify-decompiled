package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hlh1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ilh1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hlh1(ilh1 ilh1Var, byte b) {
        super(1);
        this.a = b;
        this.b = ilh1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ilh1 ilh1Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return (r6h1) ilh1Var.b;
            default:
                return new h3h1(new hlh1(ilh1Var, (byte) 0));
        }
    }
}
