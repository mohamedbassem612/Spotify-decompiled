package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jx50 {
    public final ix50 a;
    public final boolean b;
    public final int c;

    public jx50(ix50 ix50Var, boolean z, int i) {
        this.a = ix50Var;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx50)) {
            return false;
        }
        jx50 jx50Var = (jx50) obj;
        return u890.j(this.a, jx50Var.a) && this.b == jx50Var.b && this.c == jx50Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
