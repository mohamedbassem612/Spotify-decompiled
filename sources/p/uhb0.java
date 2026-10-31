package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uhb0 implements xhb0 {
    public final String a;
    public final String b;
    public final String c;
    public final tv80 d;

    public uhb0(String str, String str2, String str3, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhb0)) {
            return false;
        }
        uhb0 uhb0Var = (uhb0) obj;
        return u890.j(this.a, uhb0Var.a) && u890.j(this.b, uhb0Var.b) && this.c.equals(uhb0Var.c) && u890.j(this.d, uhb0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        tv80 tv80Var = this.d;
        return iD + (tv80Var != null ? tv80Var.hashCode() : 0);
    }
}
