package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class gzh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e0i0 b;

    public /* synthetic */ gzh0(e0i0 e0i0Var, byte b) {
        this.a = b;
        this.b = e0i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e0i0 e0i0Var = this.b;
        switch (b) {
            case 0:
                e0i0Var.i(new gzh0(e0i0Var, (byte) 1));
                break;
            default:
                e0i0Var.m();
                break;
        }
    }
}
