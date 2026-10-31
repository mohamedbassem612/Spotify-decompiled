package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class klh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rlh0 b;

    public /* synthetic */ klh0(rlh0 rlh0Var, byte b) {
        this.a = b;
        this.b = rlh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rlh0 rlh0Var = this.b;
        switch (b) {
            case 0:
                rlh0Var.c.a.clear();
                break;
            default:
                jbu0 jbu0Var = rlh0Var.G;
                if (jbu0Var != null) {
                    rlh0Var.x(jbu0Var, ebu0.c);
                }
                break;
        }
    }
}
