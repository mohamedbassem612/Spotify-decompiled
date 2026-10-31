package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hit extends vdy0 implements oht {
    public final ggy0 b1;
    public final zjn0 c1;
    public final l141 d1;
    public final y3j1 e1;
    public final xht f1;

    public hit(n9r n9rVar, tdy0 tdy0Var, fg5 fg5Var, int i, lht lhtVar, boolean z, ajn0 ajn0Var, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ggy0 ggy0Var, zjn0 zjn0Var, l141 l141Var, y3j1 y3j1Var, xht xhtVar) {
        super(n9rVar, tdy0Var, fg5Var, i, lhtVar, z, ajn0Var, i2, mka1.m0, z2, z3, z6, z4, z5);
        this.b1 = ggy0Var;
        this.c1 = zjn0Var;
        this.d1 = l141Var;
        this.e1 = y3j1Var;
        this.f1 = xhtVar;
    }

    @Override // p.ait
    public final l141 C() {
        return this.d1;
    }

    public final ggy0 F1() {
        return this.b1;
    }

    @Override // p.ait
    public final zjn0 G() {
        return this.c1;
    }

    @Override // p.ait
    public final xht H() {
        return this.f1;
    }

    @Override // p.ait
    public final t8 X() {
        return this.b1;
    }

    @Override // p.vdy0, p.zji0
    public final boolean isExternal() {
        return no20.G.d(this.b1.d).booleanValue();
    }

    @Override // p.vdy0
    public final vdy0 z1(n9r n9rVar, int i, lht lhtVar, tdy0 tdy0Var, int i2, ajn0 ajn0Var) {
        return new hit(n9rVar, tdy0Var, getAnnotations(), i, lhtVar, this.g, ajn0Var, i2, this.O0, this.P0, isExternal(), this.S0, this.Q0, this.b1, this.c1, this.d1, this.e1, this.f1);
    }
}
