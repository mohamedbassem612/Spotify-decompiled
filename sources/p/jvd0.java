package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jvd0 implements ez00 {
    public final gvd0 a;
    public final fvd0 b;

    public jvd0(gvd0 gvd0Var, fvd0 fvd0Var) {
        this.a = gvd0Var;
        this.b = fvd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvd0)) {
            return false;
        }
        jvd0 jvd0Var = (jvd0) obj;
        return u890.j(this.a, jvd0Var.a) && u890.j(this.b, jvd0Var.b);
    }

    public final int hashCode() {
        gvd0 gvd0Var = this.a;
        int iHashCode = (gvd0Var == null ? 0 : gvd0Var.hashCode()) * 31;
        fvd0 fvd0Var = this.b;
        return iHashCode + (fvd0Var != null ? fvd0Var.hashCode() : 0);
    }
}
