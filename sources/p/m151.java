package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m151 extends q151 {
    public final String a;
    public final tv80 b;

    public m151(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m151)) {
            return false;
        }
        m151 m151Var = (m151) obj;
        return u890.j(this.a, m151Var.a) && u890.j(this.b, m151Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
