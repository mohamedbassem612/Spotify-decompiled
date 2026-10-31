package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w051 extends q151 {
    public final String a;
    public final String b;
    public final d951 c;
    public final tv80 d;

    public w051(String str, String str2, d951 d951Var, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = d951Var;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w051)) {
            return false;
        }
        w051 w051Var = (w051) obj;
        return u890.j(this.a, w051Var.a) && u890.j(this.b, w051Var.b) && u890.j(this.c, w051Var.c) && u890.j(this.d, w051Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        tv80 tv80Var = this.d;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }

    public /* synthetic */ w051(String str, String str2, d951 d951Var) {
        this(str, str2, d951Var, null);
    }
}
