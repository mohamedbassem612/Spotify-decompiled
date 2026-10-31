package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gry implements ylt0 {
    public final pry a;

    public gry(pry pryVar) {
        this.a = pryVar;
    }

    @Override // p.ylt0
    public final Object a(slt0 slt0Var, ast0 ast0Var, r840 r840Var, y4m y4mVar, tv80 tv80Var, ijk0 ijk0Var, boolean z, onm onmVar) {
        String str;
        if (slt0Var instanceof qlt0) {
            str = ((qlt0) slt0Var).a;
        } else if (slt0Var instanceof plt0) {
            str = ((plt0) slt0Var).a;
        } else {
            if (!(slt0Var instanceof rlt0)) {
                eg.o();
                return null;
            }
            str = ((rlt0) slt0Var).b;
        }
        Object objB = this.a.b(str, onmVar, tv80Var, ast0Var != ast0.c);
        return objB == d9n.a ? objB : rih1.a;
    }
}
