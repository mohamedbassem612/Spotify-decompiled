package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ppc extends gf30 {
    public final /* synthetic */ qpc b;
    public final /* synthetic */ i25 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppc(qpc qpcVar, i25 i25Var, c291 c291Var) {
        super(c291Var);
        this.b = qpcVar;
        this.c = i25Var;
    }

    @Override // p.gf30, p.c291, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qpc qpcVar = this.b;
        i25 i25Var = this.c;
        synchronized (qpcVar) {
            if (i25Var.a) {
                return;
            }
            i25Var.a = true;
            super.close();
            ((y861) this.c.b).e();
        }
    }
}
