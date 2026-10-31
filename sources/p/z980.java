package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z980 extends j1h1 {
    public final y0h1[] b;
    public final e1h1[] c;
    public final boolean d;

    public z980(y0h1[] y0h1VarArr, e1h1[] e1h1VarArr, boolean z) {
        this.b = y0h1VarArr;
        this.c = e1h1VarArr;
        this.d = z;
    }

    @Override // p.j1h1
    public final boolean b() {
        return this.d;
    }

    @Override // p.j1h1
    public final e1h1 d(a8b0 a8b0Var) {
        jfg jfgVarS = a8b0Var.t0().s();
        y0h1 y0h1Var = jfgVarS instanceof y0h1 ? (y0h1) jfgVarS : null;
        if (y0h1Var != null) {
            int index = y0h1Var.getIndex();
            y0h1[] y0h1VarArr = this.b;
            if (index < y0h1VarArr.length && u890.j(y0h1VarArr[index].g(), y0h1Var.g())) {
                return this.c[index];
            }
        }
        return null;
    }

    @Override // p.j1h1
    public final boolean e() {
        return this.c.length == 0;
    }
}
