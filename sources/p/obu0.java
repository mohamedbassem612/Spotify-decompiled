package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class obu0 implements qku {
    public final /* synthetic */ qbu0 a;
    public final /* synthetic */ Runnable b;

    public obu0(qbu0 qbu0Var, Runnable runnable) {
        this.a = qbu0Var;
        this.b = runnable;
    }

    public final void dispose() {
        this.a.c.removeCallbacks(this.b);
    }
}
