package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qzt0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c0u0 b;
    public final /* synthetic */ long c;

    public qzt0(c0u0 c0u0Var, long j, long j2) {
        this.a = (byte) 0;
        this.b = c0u0Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(this.c);
                break;
            case 1:
                this.b.F(this.c);
                break;
            default:
                this.b.b(this.c);
                break;
        }
    }

    public /* synthetic */ qzt0(c0u0 c0u0Var, long j, byte b) {
        this.a = b;
        this.b = c0u0Var;
        this.c = j;
    }
}
