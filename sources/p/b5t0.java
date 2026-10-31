package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b5t0 {
    public final e5t0 a;

    public b5t0(e5t0 e5t0Var) {
        this.a = e5t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b5t0) && u890.j(this.a, ((b5t0) obj).a);
    }

    public final int hashCode() {
        e5t0 e5t0Var = this.a;
        if (e5t0Var == null) {
            return 0;
        }
        return e5t0Var.hashCode();
    }
}
