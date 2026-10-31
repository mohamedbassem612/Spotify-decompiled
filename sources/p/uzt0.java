package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uzt0 implements Runnable {
    public final /* synthetic */ c0u0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ jgc1 c;
    public final /* synthetic */ long d;

    public uzt0(c0u0 c0u0Var, int i, jgc1 jgc1Var, long j) {
        this.a = c0u0Var;
        this.b = i;
        this.c = jgc1Var;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j(this.b, this.c, this.d);
    }
}
