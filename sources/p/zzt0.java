package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zzt0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c0u0 b;

    public zzt0(c0u0 c0u0Var, int i, long j, long j2) {
        this.a = (byte) 1;
        this.b = c0u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            case 1:
                this.b.getClass();
                break;
            case 2:
                this.b.f();
                break;
            default:
                this.b.y();
                break;
        }
    }

    public /* synthetic */ zzt0(c0u0 c0u0Var, long j, long j2, byte b) {
        this.a = b;
        this.b = c0u0Var;
    }

    public zzt0(c0u0 c0u0Var, ko51 ko51Var, long j) {
        this.a = (byte) 0;
        this.b = c0u0Var;
    }
}
