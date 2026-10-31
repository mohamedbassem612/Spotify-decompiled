package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n6k1 {
    public final m6k1 a;
    public final boolean b;

    public n6k1(m6k1 m6k1Var, boolean z) {
        this.a = m6k1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6k1)) {
            return false;
        }
        n6k1 n6k1Var = (n6k1) obj;
        return this.a.equals(n6k1Var.a) && this.b == n6k1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
