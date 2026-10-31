package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q0e extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ttm0 b;
    public final /* synthetic */ zau0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0e(ttm0 ttm0Var, zau0 zau0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ttm0Var;
        this.c = zau0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        zau0 zau0Var = this.c;
        ttm0 ttm0Var = this.b;
        switch (b) {
            case 0:
                ttm0Var.a(zau0Var);
                return new p0e(ttm0Var, zau0Var, (byte) 0);
            default:
                ttm0Var.a(zau0Var);
                return new p0e(ttm0Var, zau0Var, (byte) 1);
        }
    }
}
