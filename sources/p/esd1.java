package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class esd1 extends zrd1 {
    public final Runnable c;

    public esd1(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(v8r.l(runnable));
        sb.append('@');
        sb.append(v8r.n(runnable));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        return gvg.k(sb, this.b ? "Blocking" : "Non-blocking", ']');
    }
}
