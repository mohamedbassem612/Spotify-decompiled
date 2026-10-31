package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r2o {
    public final f1o a;
    public final zei0 b;

    public r2o(f1o f1oVar, zei0 zei0Var) {
        this.a = f1oVar;
        this.b = zei0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r2o) {
            r2o r2oVar = (r2o) obj;
            if (this.a == r2oVar.a && u890.j(this.b, r2oVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
