package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mx41 extends xyn1 {
    public final String b;
    public final String c;
    public final tv80 d;
    public final boolean e;

    public mx41(String str, String str2, tv80 tv80Var, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = tv80Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx41)) {
            return false;
        }
        mx41 mx41Var = (mx41) obj;
        return u890.j(this.b, mx41Var.b) && u890.j(this.c, mx41Var.c) && u890.j(this.d, mx41Var.d) && this.e == mx41Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.b.hashCode() * 31, 31, this.c);
        tv80 tv80Var = this.d;
        return Boolean.hashCode(this.e) + ((iD + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31);
    }
}
