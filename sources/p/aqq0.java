package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aqq0 implements lly0 {
    public static final bhn0 c = new bhn0(8);
    public static final i1i d = new i1i(5);
    public k2t a;
    public volatile lly0 b;

    public aqq0(bhn0 bhn0Var, lly0 lly0Var) {
        this.a = bhn0Var;
        this.b = lly0Var;
    }

    public final void a(k2t k2tVar) {
        lly0 lly0Var;
        lly0 lly0Var2;
        lly0 lly0Var3 = this.b;
        i1i i1iVar = d;
        if (lly0Var3 != i1iVar) {
            k2tVar.b(lly0Var3);
            return;
        }
        synchronized (this) {
            lly0Var = this.b;
            if (lly0Var != i1iVar) {
                lly0Var2 = lly0Var;
            } else {
                this.a = new zpq0(this.a, k2tVar);
                lly0Var2 = null;
            }
        }
        if (lly0Var2 != null) {
            k2tVar.b(lly0Var);
        }
    }

    @Override // p.lly0
    public final Object get() {
        return this.b.get();
    }
}
