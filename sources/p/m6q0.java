package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m6q0 {
    public final a6q0 a;
    public final boolean b;

    public m6q0(a6q0 a6q0Var, boolean z) {
        this.a = a6q0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6q0)) {
            return false;
        }
        m6q0 m6q0Var = (m6q0) obj;
        return this.a.equals(m6q0Var.a) && this.b == m6q0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
