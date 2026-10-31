package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class k3d1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n3d1 b;

    public /* synthetic */ k3d1(n3d1 n3d1Var, byte b) {
        this.a = b;
        this.b = n3d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        n3d1 n3d1Var = this.b;
        switch (b) {
            case 0:
                ((js50) x2g0.A()).execute(new k3d1(n3d1Var, (byte) 1));
                break;
            default:
                if (!n3d1Var.n) {
                    n3d1Var.d();
                }
                break;
        }
    }
}
