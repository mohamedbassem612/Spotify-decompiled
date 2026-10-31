package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m401 {
    public final l401 a;
    public final String b;

    public m401(l401 l401Var, String str) {
        this.a = l401Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m401)) {
            return false;
        }
        m401 m401Var = (m401) obj;
        return this.a.equals(m401Var.a) && this.b.equals(m401Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
