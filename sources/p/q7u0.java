package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class q7u0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v1k1 b;

    public /* synthetic */ q7u0(v1k1 v1k1Var, byte b) {
        this.a = b;
        this.b = v1k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v1k1 v1k1Var = this.b;
        switch (b) {
            case 0:
                v1k1Var.e();
                break;
            case 1:
                v1k1Var.d();
                break;
            default:
                v1k1Var.a();
                break;
        }
    }
}
