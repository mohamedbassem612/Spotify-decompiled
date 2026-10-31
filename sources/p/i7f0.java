package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i7f0 {
    public final tr80 a;
    public final h7f0 b;

    public i7f0(tr80 tr80Var, h7f0 h7f0Var) {
        this.a = tr80Var;
        this.b = h7f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i7f0) {
            i7f0 i7f0Var = (i7f0) obj;
            return u890.j(this.a, i7f0Var.a) && this.b == i7f0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
