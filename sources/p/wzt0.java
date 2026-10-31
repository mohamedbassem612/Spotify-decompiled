package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wzt0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n590 b;

    public /* synthetic */ wzt0(n590 n590Var, long j, byte b) {
        this.a = b;
        this.b = n590Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        n590 n590Var = this.b;
        switch (b) {
            case 0:
                n590Var.t();
                break;
            case 1:
                n590Var.t();
                break;
        }
    }
}
