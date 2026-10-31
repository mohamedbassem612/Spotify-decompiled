package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yzi1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r6h1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yzi1(r6h1 r6h1Var, byte b) {
        super(1);
        this.a = b;
        this.b = r6h1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        r6h1 r6h1Var = this.b;
        switch (b) {
            case 0:
                return new h3h1(new cb1(r6h1Var, (byte) 29));
            case 1:
                ((Number) obj).intValue();
                return r6h1Var;
            case 2:
                return new h3h1(new yzi1(r6h1Var, (byte) 1));
            case 3:
                ((Number) obj).intValue();
                return r6h1Var;
            case 4:
                return new h3h1(new yzi1(r6h1Var, (byte) 3));
            default:
                ((Number) obj).intValue();
                return r6h1Var;
        }
    }
}
