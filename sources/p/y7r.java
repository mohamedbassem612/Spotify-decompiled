package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y7r {
    public final Object a = new Object();
    public faa0 b;

    public final boolean a(c9n c9nVar, iu30 iu30Var) {
        synchronized (this.a) {
            faa0 faa0Var = this.b;
            if (faa0Var != null && faa0Var.isActive()) {
                return false;
            }
            this.b = c921.y(c9nVar, (o8n) null, 0, new clo(iu30Var, this, (lnm) null, (byte) 7), 3);
            return true;
        }
    }
}
