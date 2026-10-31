package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a0u0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c0u0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;

    public /* synthetic */ a0u0(c0u0 c0u0Var, long j, long j2, boolean z, long j3, byte b) {
        this.a = b;
        this.b = c0u0Var;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z = this.e;
                this.b.l(this.c, this.d, this.f, z);
                break;
            default:
                boolean z2 = this.e;
                this.b.p(this.c, this.d, this.f, z2);
                break;
        }
    }
}
