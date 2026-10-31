package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s27 {
    public final g07 a;
    public final int b;
    public final int c;

    public s27(g07 g07Var, int i, int i2) {
        this.a = g07Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s27)) {
            return false;
        }
        s27 s27Var = (s27) obj;
        return this.a.equals(s27Var.a) && this.b == s27Var.b && this.c == s27Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
