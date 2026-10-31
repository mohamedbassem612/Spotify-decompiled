package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ozt0 implements Runnable {
    public final /* synthetic */ c0u0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public ozt0(c0u0 c0u0Var, int i, long j, long j2) {
        this.a = c0u0Var;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.o(this.b, this.c, this.d);
    }
}
