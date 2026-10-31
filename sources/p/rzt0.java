package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rzt0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c0u0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    public /* synthetic */ rzt0(c0u0 c0u0Var, int i, long j, byte b) {
        this.a = b;
        this.b = c0u0Var;
        this.c = i;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C(this.c, this.d);
                break;
            default:
                this.b.P(this.c, this.d);
                break;
        }
    }
}
