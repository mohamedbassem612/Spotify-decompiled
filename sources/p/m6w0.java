package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m6w0 {
    public final yq91 a;
    public final k6w0 b;

    public m6w0(yq91 yq91Var, k6w0 k6w0Var) {
        this.a = yq91Var;
        this.b = k6w0Var;
    }

    public final yq91 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m6w0) {
            m6w0 m6w0Var = (m6w0) obj;
            if (this.a == m6w0Var.a && this.b.equals(m6w0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
