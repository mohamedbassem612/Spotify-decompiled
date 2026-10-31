package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e6r0 implements f6r0 {
    public final n6r0 a;
    public final qir0 b;

    public e6r0(n6r0 n6r0Var, qir0 qir0Var) {
        this.a = n6r0Var;
        this.b = qir0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6r0)) {
            return false;
        }
        e6r0 e6r0Var = (e6r0) obj;
        return u890.j(this.a, e6r0Var.a) && u890.j(this.b, e6r0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qir0 qir0Var = this.b;
        return iHashCode + (qir0Var == null ? 0 : qir0Var.a.hashCode());
    }
}
