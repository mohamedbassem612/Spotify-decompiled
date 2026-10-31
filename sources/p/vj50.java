package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vj50 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Long e;

    public vj50(Long l, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj50)) {
            return false;
        }
        vj50 vj50Var = (vj50) obj;
        return u890.j(this.a, vj50Var.a) && u890.j(this.b, vj50Var.b) && u890.j(this.c, vj50Var.c) && this.d == vj50Var.d && u890.j(this.e, vj50Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Long l = this.e;
        return iG + (l != null ? l.hashCode() : 0);
    }
}
