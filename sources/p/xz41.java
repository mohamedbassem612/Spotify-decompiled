package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xz41 extends q151 {
    public final String a;
    public final String b;
    public final tv80 c;
    public final String d;
    public final String e;

    public xz41(String str, String str2, String str3, String str4, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz41)) {
            return false;
        }
        xz41 xz41Var = (xz41) obj;
        return u890.j(this.a, xz41Var.a) && u890.j(this.b, xz41Var.b) && u890.j(this.c, xz41Var.c) && u890.j(this.d, xz41Var.d) && u890.j(this.e, xz41Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        int iHashCode = (iD + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
