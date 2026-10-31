package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r051 extends q151 {
    public final String a;
    public final String b;
    public final tv80 c;

    public r051(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r051)) {
            return false;
        }
        r051 r051Var = (r051) obj;
        return u890.j(this.a, r051Var.a) && u890.j(this.b, r051Var.b) && u890.j(this.c, r051Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
