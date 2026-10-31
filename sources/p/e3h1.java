package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e3h1 implements auw {
    public final l6h1 a;
    public final i8h1 b;
    public final n7h1 c;

    public e3h1(l6h1 l6h1Var, n7h1 n7h1Var, i8h1 i8h1Var) {
        this.a = l6h1Var;
        this.b = i8h1Var;
        this.c = n7h1Var;
    }

    @Override // p.auw
    public final ztw create() {
        i8h1 i8h1Var = this.b;
        return new f3h1(this.a, this.c, i8h1Var);
    }
}
