package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mzt0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c0u0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ mzt0(c0u0 c0u0Var, boolean z, long j, long j2, byte b) {
        this.a = b;
        this.b = c0u0Var;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Q(this.d, this.e, this.c);
                break;
            case 1:
                this.b.d(this.d, this.e, this.c);
                break;
            default:
                this.b.n(this.d, this.e, this.c);
                break;
        }
    }
}
