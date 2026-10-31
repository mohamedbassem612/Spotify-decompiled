package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m9z0 {
    public final boolean a;
    public final ejo1 b;
    public final boolean c;

    public m9z0(boolean z, ejo1 ejo1Var, boolean z2) {
        this.a = z;
        this.b = ejo1Var;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9z0)) {
            return false;
        }
        m9z0 m9z0Var = (m9z0) obj;
        return this.a == m9z0Var.a && u890.j(this.b, m9z0Var.b) && this.c == m9z0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
