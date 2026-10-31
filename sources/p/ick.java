package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ick extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fb5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ick(fb5 fb5Var, byte b) {
        super(2);
        this.a = b;
        this.b = fb5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        fb5 fb5Var = this.b;
        switch (b) {
            case 0:
                return new u7h(fb5Var.c);
            case 1:
                return new u7h(fb5Var.a);
            default:
                return new u7h(fb5Var.b);
        }
    }
}
