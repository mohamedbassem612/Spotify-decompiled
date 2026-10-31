package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nsy0 extends rsy0 {
    public final m560 a;
    public final boolean b;

    public nsy0(m560 m560Var, boolean z) {
        this.a = m560Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsy0)) {
            return false;
        }
        nsy0 nsy0Var = (nsy0) obj;
        return u890.j(this.a, nsy0Var.a) && this.b == nsy0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
