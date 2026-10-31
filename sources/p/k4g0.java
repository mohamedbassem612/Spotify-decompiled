package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k4g0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2e0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4g0(j2e0 j2e0Var, byte b) {
        super(1);
        this.a = b;
        this.b = j2e0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        j2e0 j2e0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return (r6h1) j2e0Var.b;
            default:
                return new h3h1(new k4g0(j2e0Var, (byte) 0));
        }
    }
}
