package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class dqh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iqh0 b;
    public final /* synthetic */ n8d0 c;
    public final /* synthetic */ ixh0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ dqh0(iqh0 iqh0Var, n8d0 n8d0Var, ixh0 ixh0Var, int i, byte b) {
        this.a = b;
        this.b = iqh0Var;
        this.c = n8d0Var;
        this.d = ixh0Var;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.e;
        ixh0 ixh0Var = this.d;
        n8d0 n8d0Var = this.c;
        iqh0 iqh0Var = this.b;
        iqh0Var.getClass();
        switch (b) {
            case 0:
                s7c0 s7c0Var = (s7c0) iqh0.O(n8d0Var);
                if (s7c0Var != null) {
                    iqh0Var.E(ixh0Var, s7c0Var);
                    iqh0.P(i, s7c0Var);
                }
                break;
            default:
                s7c0 s7c0Var2 = (s7c0) iqh0.O(n8d0Var);
                if (s7c0Var2 != null) {
                    iqh0Var.E(ixh0Var, s7c0Var2);
                    iqh0.P(i, s7c0Var2);
                }
                break;
        }
    }
}
