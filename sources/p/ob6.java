package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ob6 implements ddr0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vb6 b;

    public /* synthetic */ ob6(vb6 vb6Var, byte b) {
        this.a = b;
        this.b = vb6Var;
    }

    @Override // p.ddr0
    public final tcr0 b() {
        byte b = this.a;
        vb6 vb6Var = this.b;
        switch (b) {
            case 0:
                cdr0 cdr0Var = vb6Var.P0;
                cdr0Var.getClass();
                return cdr0Var.b();
            default:
                cdr0 cdr0Var2 = vb6Var.P0;
                cdr0Var2.getClass();
                return cdr0Var2.b();
        }
    }
}
