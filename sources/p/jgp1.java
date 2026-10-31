package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jgp1 extends nfp1 implements Runnable {
    public final Runnable h;

    public jgp1(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }

    @Override // p.nfp1
    public final String f() {
        String string = this.h.toString();
        return l1d.q(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th) {
            if (tfp1.g.F(this, null, new kfp1(th))) {
                nfp1.h(this);
            }
            throw th;
        }
    }
}
