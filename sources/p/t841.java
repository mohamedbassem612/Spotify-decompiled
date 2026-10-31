package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t841 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nt21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t841(nt21 nt21Var, byte b) {
        super(1);
        this.a = b;
        this.b = nt21Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        nt21 nt21Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return (r6h1) nt21Var.b;
            default:
                return new h3h1(new t841(nt21Var, (byte) 0));
        }
    }
}
