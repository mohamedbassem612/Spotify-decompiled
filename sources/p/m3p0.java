package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m3p0 implements q3p0 {
    public final e090 a;
    public final ou80 b;

    public m3p0(e090 e090Var, ou80 ou80Var) {
        this.a = e090Var;
        this.b = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3p0)) {
            return false;
        }
        m3p0 m3p0Var = (m3p0) obj;
        return u890.j(this.a, m3p0Var.a) && u890.j(this.b, m3p0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
