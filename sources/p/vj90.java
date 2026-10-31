package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vj90 implements wj90 {
    public final r840 a;
    public final y4m b;

    public vj90(y4m y4mVar, r840 r840Var) {
        this.a = r840Var;
        this.b = y4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj90)) {
            return false;
        }
        vj90 vj90Var = (vj90) obj;
        return u890.j(this.a, vj90Var.a) && u890.j(this.b, vj90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
