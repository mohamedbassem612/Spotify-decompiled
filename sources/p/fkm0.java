package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fkm0 extends v6.i implements Runnable {
    public final Runnable e;

    public fkm0(Runnable runnable) {
        runnable.getClass();
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.e.run();
        } catch (Throwable th) {
            v(th);
            throw th;
        }
    }

    @Override // p.v6
    public final String s() {
        return "task=[" + this.e + "]";
    }
}
