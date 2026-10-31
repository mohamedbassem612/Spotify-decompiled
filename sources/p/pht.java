package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pht extends xdg implements oht {
    public final kfy0 f1;
    public final zjn0 g1;
    public final l141 h1;
    public final y3j1 i1;
    public final xht j1;

    public pht(beg begVar, pjl pjlVar, fg5 fg5Var, boolean z, int i, kfy0 kfy0Var, zjn0 zjn0Var, l141 l141Var, y3j1 y3j1Var, xht xhtVar, mka1 mka1Var) {
        super(begVar, pjlVar, fg5Var, z, i, mka1Var == null ? mka1.m0 : mka1Var);
        this.f1 = kfy0Var;
        this.g1 = zjn0Var;
        this.h1 = l141Var;
        this.i1 = y3j1Var;
        this.j1 = xhtVar;
    }

    @Override // p.qv30, p.ov30
    public final boolean A() {
        return false;
    }

    @Override // p.ait
    public final l141 C() {
        return this.h1;
    }

    @Override // p.ait
    public final zjn0 G() {
        return this.g1;
    }

    @Override // p.xdg
    /* JADX INFO: renamed from: G1 */
    public final xdg y1(int i, fg5 fg5Var, n9r n9rVar, ov30 ov30Var, ajn0 ajn0Var, mka1 mka1Var) {
        pht phtVar = new pht((beg) n9rVar, (pjl) ov30Var, fg5Var, this.e1, i, this.f1, this.g1, this.h1, this.i1, this.j1, mka1Var);
        phtVar.W0 = this.W0;
        return phtVar;
    }

    @Override // p.ait
    public final xht H() {
        return this.j1;
    }

    @Override // p.ait
    public final t8 X() {
        return this.f1;
    }

    @Override // p.qv30, p.zji0
    public final boolean isExternal() {
        return false;
    }

    @Override // p.qv30, p.ov30
    public final boolean isInline() {
        return false;
    }

    @Override // p.qv30, p.ov30
    public final boolean isSuspend() {
        return false;
    }

    @Override // p.xdg, p.qv30
    public final qv30 y1(int i, fg5 fg5Var, n9r n9rVar, ov30 ov30Var, ajn0 ajn0Var, mka1 mka1Var) {
        pht phtVar = new pht((beg) n9rVar, (pjl) ov30Var, fg5Var, this.e1, i, this.f1, this.g1, this.h1, this.i1, this.j1, mka1Var);
        phtVar.W0 = this.W0;
        return phtVar;
    }
}
