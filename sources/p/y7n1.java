package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y7n1 extends v7n1 {
    public final /* synthetic */ c5n1 b;

    public y7n1(c5n1 c5n1Var) {
        this.b = c5n1Var;
    }

    @Override // p.v7n1
    public final void b() {
        synchronized (this.b.f) {
            try {
                if (this.b.l.get() > 0 && this.b.l.decrementAndGet() > 0) {
                    this.b.b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                c5n1 c5n1Var = this.b;
                if (c5n1Var.n != null) {
                    c5n1Var.b.b("Unbind from service.", new Object[0]);
                    c5n1 c5n1Var2 = this.b;
                    c5n1Var2.a.unbindService(c5n1Var2.m);
                    c5n1Var = this.b;
                    c5n1Var.g = false;
                    c5n1Var.n = null;
                    c5n1Var.m = null;
                }
                c5n1Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
