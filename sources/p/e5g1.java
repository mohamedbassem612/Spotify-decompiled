package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e5g1 {
    public final ast0 a;
    public final y4m b;
    public final r840 c;
    public final iix0 d;

    public e5g1(ast0 ast0Var, y4m y4mVar, r840 r840Var, iix0 iix0Var) {
        this.a = ast0Var;
        this.b = y4mVar;
        this.c = r840Var;
        this.d = iix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5g1)) {
            return false;
        }
        e5g1 e5g1Var = (e5g1) obj;
        return this.a == e5g1Var.a && this.b.equals(e5g1Var.b) && this.c.equals(e5g1Var.c) && u890.j(this.d, e5g1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        iix0 iix0Var = this.d;
        return iHashCode + (iix0Var == null ? 0 : iix0Var.hashCode());
    }
}
