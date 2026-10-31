package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c8n implements f961 {
    public final z7n a;

    public c8n(a8n a8nVar) {
        this.a = new z7n(a8nVar);
    }

    public final void shutdown() {
        this.a.d.set(true);
    }

    public final Object getApi() {
        return this;
    }
}
