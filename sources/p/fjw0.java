package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fjw0 {
    public final zle1 a;
    public final Object b = new Object();
    public ejw0 c;

    public fjw0(zle1 zle1Var) {
        this.a = zle1Var;
    }

    public final ejw0 a(String str) {
        ejw0 ejw0Var;
        ejw0 ejw0Var2;
        synchronized (this.b) {
            ejw0Var = this.c;
            ejw0Var2 = new ejw0(this.a, str, new v3v0(1, this, fjw0.class, "clear", "clear(Lcom/spotify/campaigns/rivevideo/preview/impl/domain/PreviewPerformanceTracker$Attempt;)V", 0, (byte) 8));
            this.c = ejw0Var2;
        }
        if (ejw0Var != null) {
            ejw0Var.d(3);
        }
        return ejw0Var2;
    }
}
