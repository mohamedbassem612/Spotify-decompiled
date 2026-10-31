package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yzt0 implements Runnable {
    public final /* synthetic */ c0u0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public yzt0(c0u0 c0u0Var, float f, long j, long j2) {
        this.a = c0u0Var;
        this.b = f;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.G(this.b, this.c, this.d);
    }
}
