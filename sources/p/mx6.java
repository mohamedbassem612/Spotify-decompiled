package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mx6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public mx6(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx6)) {
            return false;
        }
        mx6 mx6Var = (mx6) obj;
        return u890.j(this.a, mx6Var.a) && this.b.equals(mx6Var.b) && u890.j(this.c, mx6Var.c) && u890.j(this.d, mx6Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
