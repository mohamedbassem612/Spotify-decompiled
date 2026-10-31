package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q051 extends q151 {
    public final String a;
    public final String b;
    public final tv80 c;

    public q051(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q051)) {
            return false;
        }
        q051 q051Var = (q051) obj;
        return u890.j(this.a, q051Var.a) && u890.j(this.b, q051Var.b) && u890.j(this.c, q051Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
