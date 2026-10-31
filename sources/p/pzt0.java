package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pzt0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c0u0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public pzt0(c0u0 c0u0Var, long j, long j2, long j3, long j4) {
        this.a = (byte) 0;
        this.b = c0u0Var;
        this.c = j2;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z(this.c, this.d);
                break;
            case 1:
                this.b.K(this.c, this.d);
                break;
            case 2:
                this.b.A(this.c, this.d);
                break;
            case 3:
                this.b.k(this.c, this.d);
                break;
            case 4:
                this.b.O(this.c, this.d);
                break;
            case 5:
                this.b.S(this.c, this.d);
                break;
            case 6:
                this.b.m(this.c, this.d);
                break;
            default:
                this.b.J(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ pzt0(c0u0 c0u0Var, long j, long j2, byte b) {
        this.a = b;
        this.b = c0u0Var;
        this.c = j;
        this.d = j2;
    }
}
