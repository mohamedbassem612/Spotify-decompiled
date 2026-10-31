package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n84 {
    public final m84 a;
    public final int b;

    public n84(m84 m84Var, int i) {
        this.a = m84Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n84)) {
            return false;
        }
        n84 n84Var = (n84) obj;
        return this.a == n84Var.a && this.b == n84Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
