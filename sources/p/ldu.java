package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ldu extends j1h1 {
    public final j1h1 b;
    public final j1h1 c;

    public ldu(j1h1 j1h1Var, j1h1 j1h1Var2) {
        this.b = j1h1Var;
        this.c = j1h1Var2;
    }

    @Override // p.j1h1
    public final boolean a() {
        return this.b.a() || this.c.a();
    }

    @Override // p.j1h1
    public final boolean b() {
        return this.b.b() || this.c.b();
    }

    @Override // p.j1h1
    public final fg5 c(fg5 fg5Var) {
        return this.c.c(this.b.c(fg5Var));
    }

    @Override // p.j1h1
    public final e1h1 d(a8b0 a8b0Var) {
        e1h1 e1h1VarD = this.b.d(a8b0Var);
        return e1h1VarD == null ? this.c.d(a8b0Var) : e1h1VarD;
    }

    @Override // p.j1h1
    public final a8b0 f(int i, a8b0 a8b0Var) {
        return this.c.f(i, this.b.f(i, a8b0Var));
    }
}
