package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w6q0 {
    public final v6q0 a;
    public final int b;

    public w6q0(v6q0 v6q0Var, int i) {
        this.a = v6q0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6q0)) {
            return false;
        }
        w6q0 w6q0Var = (w6q0) obj;
        return this.a.equals(w6q0Var.a) && this.b == w6q0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
