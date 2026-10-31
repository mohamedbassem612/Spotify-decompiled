package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class as50 implements qku {
    public final /* synthetic */ bs50 a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ as50(bs50 bs50Var, Runnable runnable) {
        this.a = bs50Var;
        this.b = runnable;
    }

    public final void dispose() {
        this.a.c.removeCallbacks(this.b);
    }
}
