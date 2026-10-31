package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bjh1 extends q8n {
    public static final bjh1 c = new bjh1();

    @Override // p.q8n
    public final q8n M(int i) {
        buo1.u(i);
        return i >= jsd1.d ? this : super.M(i);
    }

    @Override // p.q8n
    public final void h(o8n o8nVar, Runnable runnable) {
        fns.d.c.c(runnable, true, false);
    }

    @Override // p.q8n
    public final void q(o8n o8nVar, Runnable runnable) {
        fns.d.c.c(runnable, true, true);
    }

    @Override // p.q8n
    public final String toString() {
        return "Dispatchers.IO";
    }
}
