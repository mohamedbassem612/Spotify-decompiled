package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jot0 {
    public final v6y0 a;
    public final boolean b;

    public jot0(v6y0 v6y0Var, boolean z) {
        this.a = v6y0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jot0)) {
            return false;
        }
        jot0 jot0Var = (jot0) obj;
        return u890.j(this.a, jot0Var.a) && this.b == jot0Var.b;
    }

    public final int hashCode() {
        v6y0 v6y0Var = this.a;
        return Boolean.hashCode(this.b) + ((v6y0Var == null ? 0 : v6y0Var.hashCode()) * 31);
    }
}
