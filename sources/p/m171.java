package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m171 {
    public final boolean a;
    public final ibk0 b;

    public m171(boolean z, ibk0 ibk0Var) {
        this.a = z;
        this.b = ibk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m171)) {
            return false;
        }
        m171 m171Var = (m171) obj;
        return this.a == m171Var.a && u890.j(this.b, m171Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        ibk0 ibk0Var = this.b;
        return iHashCode + (ibk0Var == null ? 0 : ibk0Var.hashCode());
    }
}
