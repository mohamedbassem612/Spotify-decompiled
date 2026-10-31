package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ksy0 extends rsy0 {
    public final c560 a;
    public final v1p1 b;

    public ksy0(c560 c560Var, v1p1 v1p1Var) {
        this.a = c560Var;
        this.b = v1p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksy0)) {
            return false;
        }
        ksy0 ksy0Var = (ksy0) obj;
        return this.a.equals(ksy0Var.a) && this.b.equals(ksy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
