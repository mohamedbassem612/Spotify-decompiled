package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iit extends xw81 implements oht {
    public final yfy0 e1;
    public final zjn0 f1;
    public final l141 g1;
    public final y3j1 h1;
    public final xht i1;

    public iit(n9r n9rVar, xw81 xw81Var, fg5 fg5Var, ajn0 ajn0Var, int i, yfy0 yfy0Var, zjn0 zjn0Var, l141 l141Var, y3j1 y3j1Var, xht xhtVar, mka1 mka1Var) {
        super(n9rVar, xw81Var, fg5Var, ajn0Var, i, mka1Var == null ? mka1.m0 : mka1Var);
        this.e1 = yfy0Var;
        this.f1 = zjn0Var;
        this.g1 = l141Var;
        this.h1 = y3j1Var;
        this.i1 = xhtVar;
    }

    @Override // p.ait
    public final l141 C() {
        return this.g1;
    }

    @Override // p.ait
    public final zjn0 G() {
        return this.f1;
    }

    @Override // p.ait
    public final xht H() {
        return this.i1;
    }

    public final yfy0 L1() {
        return this.e1;
    }

    @Override // p.ait
    public final t8 X() {
        return this.e1;
    }

    @Override // p.xw81, p.qv30
    public final qv30 y1(int i, fg5 fg5Var, n9r n9rVar, ov30 ov30Var, ajn0 ajn0Var, mka1 mka1Var) {
        iit iitVar = new iit(n9rVar, (xw81) ov30Var, fg5Var, ajn0Var == null ? getName() : ajn0Var, i, this.e1, this.f1, this.g1, this.h1, this.i1, mka1Var);
        iitVar.W0 = this.W0;
        return iitVar;
    }
}
