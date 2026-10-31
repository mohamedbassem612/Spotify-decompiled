package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class gqh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iqh0 b;
    public final /* synthetic */ f280 c;
    public final /* synthetic */ ixh0 d;

    public /* synthetic */ gqh0(iqh0 iqh0Var, f280 f280Var, ixh0 ixh0Var, byte b) {
        this.a = b;
        this.b = iqh0Var;
        this.c = f280Var;
        this.d = ixh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ixh0 ixh0Var = this.d;
        f280 f280Var = this.c;
        iqh0 iqh0Var = this.b;
        iqh0Var.getClass();
        switch (b) {
            case 0:
                s7c0 s7c0Var = (s7c0) iqh0.O(f280Var);
                if (s7c0Var != null) {
                    iqh0Var.E(ixh0Var, s7c0Var);
                }
                break;
            default:
                s7c0 s7c0Var2 = (s7c0) iqh0.O(f280Var);
                if (s7c0Var2 != null) {
                    iqh0Var.E(ixh0Var, s7c0Var2);
                }
                break;
        }
    }
}
