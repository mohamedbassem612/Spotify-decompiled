package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n0g extends iaa0 implements m0g {
    public final saa0 g;

    public n0g(saa0 saa0Var) {
        this.g = saa0Var;
    }

    @Override // p.m0g
    public final boolean a(Throwable th) {
        return j().V(th);
    }

    @Override // p.m0g
    public final faa0 getParent() {
        return j();
    }

    @Override // p.iaa0
    public final boolean k() {
        return true;
    }

    @Override // p.iaa0
    public final void l(Throwable th) {
        this.g.R(j());
    }
}
