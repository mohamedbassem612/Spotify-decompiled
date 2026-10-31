package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class klz0 {
    public final jlz0 a;
    public final ilz0 b;

    public klz0(jlz0 jlz0Var, ilz0 ilz0Var) {
        this.a = jlz0Var;
        this.b = ilz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klz0)) {
            return false;
        }
        klz0 klz0Var = (klz0) obj;
        return u890.j(this.a, klz0Var.a) && u890.j(this.b, klz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
