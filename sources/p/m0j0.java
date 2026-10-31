package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m0j0 implements w0j0 {
    public final String a;
    public final ou80 b;

    public m0j0(String str, ou80 ou80Var) {
        this.a = str;
        this.b = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0j0)) {
            return false;
        }
        m0j0 m0j0Var = (m0j0) obj;
        return u890.j(this.a, m0j0Var.a) && u890.j(this.b, m0j0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ou80 ou80Var = this.b;
        return iHashCode + (ou80Var == null ? 0 : ou80Var.a.hashCode());
    }
}
