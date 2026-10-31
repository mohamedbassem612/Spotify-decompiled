package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m2f implements q3f {
    public final String a;
    public final ou80 b;

    public m2f(String str, ou80 ou80Var) {
        this.a = str;
        this.b = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2f)) {
            return false;
        }
        m2f m2fVar = (m2f) obj;
        return u890.j(this.a, m2fVar.a) && u890.j(this.b, m2fVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ou80 ou80Var = this.b;
        return iHashCode + (ou80Var == null ? 0 : ou80Var.a.hashCode());
    }
}
