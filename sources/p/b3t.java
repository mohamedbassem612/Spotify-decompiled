package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b3t extends q8n {
    public static final /* synthetic */ long e = avg.a.objectFieldOffset(b3t.class.getDeclaredField("d"));
    public final q8n c;
    public volatile /* synthetic */ int d = 1;

    public b3t(q8n q8nVar) {
        this.c = q8nVar;
    }

    public final boolean J(o8n o8nVar) {
        return N().J(o8nVar);
    }

    public final q8n M(int i) {
        return N().M(i);
    }

    public final q8n N() {
        return avg.a.getIntVolatile(this, e) == 1 ? igu.b : this.c;
    }

    public final void h(o8n o8nVar, Runnable runnable) {
        N().h(o8nVar, runnable);
    }

    public final void q(o8n o8nVar, Runnable runnable) {
        N().q(o8nVar, runnable);
    }

    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.c + ")";
    }
}
