package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c6h1 {
    public final n6r0 a;
    public final r6h1 b;

    public c6h1(n6r0 n6r0Var, r6h1 r6h1Var) {
        this.a = n6r0Var;
        this.b = r6h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6h1)) {
            return false;
        }
        c6h1 c6h1Var = (c6h1) obj;
        return u890.j(this.a, c6h1Var.a) && this.b.equals(c6h1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
