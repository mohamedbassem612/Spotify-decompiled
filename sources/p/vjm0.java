package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vjm0 {
    public final a7q0 a;

    public vjm0(a7q0 a7q0Var) {
        this.a = a7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vjm0) && u890.j(this.a, ((vjm0) obj).a);
    }

    public final int hashCode() {
        a7q0 a7q0Var = this.a;
        if (a7q0Var == null) {
            return 0;
        }
        return a7q0Var.hashCode();
    }
}
