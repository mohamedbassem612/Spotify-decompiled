package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uwq0 implements dbr0 {
    public final twq0 a;

    public uwq0(twq0 twq0Var) {
        this.a = twq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uwq0) && u890.j(this.a, ((uwq0) obj).a);
    }

    public final int hashCode() {
        twq0 twq0Var = this.a;
        if (twq0Var == null) {
            return 0;
        }
        return twq0Var.hashCode();
    }
}
