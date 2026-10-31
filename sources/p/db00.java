package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class db00 extends eb00 {
    public final Runnable c;

    public db00(Runnable runnable, long j) {
        super(j);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // p.eb00
    public final String toString() {
        return super.toString() + this.c;
    }
}
