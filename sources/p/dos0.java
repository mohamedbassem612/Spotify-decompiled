package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dos0 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public dos0(String str, long j, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dos0)) {
            return false;
        }
        dos0 dos0Var = (dos0) obj;
        return u890.j(this.a, dos0Var.a) && this.b == dos0Var.b && u890.j(this.c, dos0Var.c) && u890.j(this.d, dos0Var.d) && u890.j(this.e, dos0Var.e) && u890.j(this.f, dos0Var.f) && u890.j(this.g, dos0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
