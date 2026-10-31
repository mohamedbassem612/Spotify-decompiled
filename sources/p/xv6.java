package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xv6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xv6(yv6 yv6Var, byte b) {
        super(1);
        this.a = b;
        this.b = yv6Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        yv6 yv6Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return yv6Var.t.b();
            default:
                return new h3h1(new xv6(yv6Var, (byte) 0));
        }
    }
}
