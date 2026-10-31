package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class evn implements dvn {
    public final c3s a;
    public final e7p0 b;

    public evn(c3s c3sVar, e7p0 e7p0Var) {
        this.a = c3sVar;
        this.b = e7p0Var;
    }

    @Override // p.dvn
    public final void a(String str, ou80 ou80Var) {
        if (this.a.d()) {
            e7p0 e7p0Var = this.b;
            if (ou80Var != null) {
                e7p0.d(e7p0Var, ou80Var);
            } else {
                e7p0Var.c();
            }
        }
    }
}
