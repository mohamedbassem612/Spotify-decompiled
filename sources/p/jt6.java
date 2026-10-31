package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jt6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final boolean i;

    public jt6(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, boolean z, int i2) {
        str = (i2 & 1) != 0 ? null : str;
        str2 = (i2 & 2) != 0 ? null : str2;
        i = (i2 & 32) != 0 ? -1 : i;
        str6 = (i2 & 64) != 0 ? null : str6;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
        this.h = str7;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt6)) {
            return false;
        }
        jt6 jt6Var = (jt6) obj;
        return u890.j(this.a, jt6Var.a) && u890.j(this.b, jt6Var.b) && u890.j(this.c, jt6Var.c) && this.d.equals(jt6Var.d) && this.e.equals(jt6Var.e) && this.f == jt6Var.f && u890.j(this.g, jt6Var.g) && u890.j(this.h, jt6Var.h) && this.i == jt6Var.i;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iF = kaa0.f(this.f, cy30.d(cy30.d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.d), 31, this.e), 31);
        String str4 = this.g;
        int iHashCode3 = (iF + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        return Boolean.hashCode(this.i) + ((iHashCode3 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }
}
