package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p0e implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ttm0 b;
    public final /* synthetic */ zau0 c;

    public /* synthetic */ p0e(ttm0 ttm0Var, zau0 zau0Var, byte b) {
        this.a = b;
        this.b = ttm0Var;
        this.c = zau0Var;
    }

    public final void dispose() {
        byte b = this.a;
        zau0 zau0Var = this.c;
        ttm0 ttm0Var = this.b;
        switch (b) {
            case 0:
                ttm0Var.b(zau0Var);
                ttm0Var.d();
                break;
            default:
                ttm0Var.b(zau0Var);
                break;
        }
    }
}
