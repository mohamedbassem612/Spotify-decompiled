package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lds0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ods0 b;

    public /* synthetic */ lds0(ods0 ods0Var, byte b) {
        this.a = b;
        this.b = ods0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ods0 ods0Var = this.b;
        switch (b) {
            case 0:
                ods0Var.a.l();
                break;
            case 1:
                ods0Var.a.b();
                break;
            default:
                ods0Var.a.i();
                break;
        }
    }
}
