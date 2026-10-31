package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m1w0 extends h2w0 {
    public final String a;
    public final tv80 b;

    public m1w0(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1w0)) {
            return false;
        }
        m1w0 m1w0Var = (m1w0) obj;
        return u890.j(this.a, m1w0Var.a) && u890.j(this.b, m1w0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
