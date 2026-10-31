package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l7w0 implements r331 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n7w0 b;

    public /* synthetic */ l7w0(n7w0 n7w0Var, byte b) {
        this.a = b;
        this.b = n7w0Var;
    }

    public final void e(d331 d331Var) {
        byte b = this.a;
        n7w0 n7w0Var = this.b;
        switch (b) {
            case 0:
                k7w0 k7w0Var = new k7w0(n7w0Var, d331Var, (byte) 0);
                if (!n7w0Var.c) {
                    n7w0Var.b.add(k7w0Var);
                } else {
                    k7w0Var.invoke();
                }
                break;
            default:
                k7w0 k7w0Var2 = new k7w0(n7w0Var, d331Var, (byte) 1);
                if (!n7w0Var.c) {
                    n7w0Var.b.add(k7w0Var2);
                } else {
                    k7w0Var2.invoke();
                }
                break;
        }
    }
}
