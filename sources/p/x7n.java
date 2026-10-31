package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x7n extends q8n {
    public final a8n c;

    public x7n(a8n a8nVar) {
        this.c = a8nVar;
    }

    public final void h(o8n o8nVar, Runnable runnable) {
        ((d8n) this.c).c.post(runnable);
    }
}
