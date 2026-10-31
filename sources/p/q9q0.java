package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q9q0 {
    public final k900 a;
    public final Boolean b;

    public q9q0(k900 k900Var, Boolean bool) {
        this.a = k900Var;
        this.b = bool;
    }

    public static q9q0 a(q9q0 q9q0Var, k900 k900Var, Boolean bool, int i) {
        if ((i & 1) != 0) {
            k900Var = q9q0Var.a;
        }
        if ((i & 2) != 0) {
            bool = q9q0Var.b;
        }
        return new q9q0(k900Var, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9q0)) {
            return false;
        }
        q9q0 q9q0Var = (q9q0) obj;
        return u890.j(this.a, q9q0Var.a) && u890.j(this.b, q9q0Var.b);
    }

    public final int hashCode() {
        k900 k900Var = this.a;
        int iHashCode = (k900Var == null ? 0 : k900Var.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
