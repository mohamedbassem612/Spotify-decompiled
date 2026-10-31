package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bkx0 implements ddr0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hkx0 b;

    public /* synthetic */ bkx0(hkx0 hkx0Var, byte b) {
        this.a = b;
        this.b = hkx0Var;
    }

    @Override // p.ddr0
    public final tcr0 b() {
        byte b = this.a;
        hkx0 hkx0Var = this.b;
        switch (b) {
            case 0:
                cdr0 cdr0Var = hkx0Var.P0;
                cdr0Var.getClass();
                return cdr0Var.b();
            default:
                cdr0 cdr0Var2 = hkx0Var.P0;
                cdr0Var2.getClass();
                return cdr0Var2.b();
        }
    }
}
