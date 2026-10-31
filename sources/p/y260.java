package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y260 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y260(uu0 uu0Var, byte b) {
        super(1);
        this.a = b;
        this.b = uu0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        uu0 uu0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return (r6h1) uu0Var.c;
            default:
                return new h3h1(new y260(uu0Var, (byte) 0));
        }
    }
}
