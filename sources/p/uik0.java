package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uik0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xjl0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uik0(xjl0 xjl0Var, byte b) {
        super(1);
        this.a = b;
        this.b = xjl0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        xjl0 xjl0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return xjl0Var.b();
            default:
                return new h3h1(new uik0(xjl0Var, (byte) 0));
        }
    }
}
