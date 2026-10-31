package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z8h1 {
    public final u6h1 a;
    public final l7h1 b;

    public z8h1(u6h1 u6h1Var, l7h1 l7h1Var) {
        this.a = u6h1Var;
        this.b = l7h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8h1)) {
            return false;
        }
        z8h1 z8h1Var = (z8h1) obj;
        return this.a.equals(z8h1Var.a) && u890.j(this.b, z8h1Var.b);
    }

    public final int hashCode() {
        return this.b.e.a.hashCode() + (this.a.hashCode() * 31);
    }
}
