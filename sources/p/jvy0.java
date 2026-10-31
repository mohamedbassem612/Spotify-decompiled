package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jvy0 {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;

    public jvy0(String str, String str2, long j, String str3, String str4, String str5, int i, String str6, int i2) {
        i = (i2 & 64) != 0 ? 0 : i;
        str6 = (i2 & 128) != 0 ? "Unknown" : str6;
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvy0)) {
            return false;
        }
        jvy0 jvy0Var = (jvy0) obj;
        return u890.j(this.a, jvy0Var.a) && u890.j(this.b, jvy0Var.b) && this.c == jvy0Var.c && u890.j(this.d, jvy0Var.d) && u890.j(this.e, jvy0Var.e) && u890.j(this.f, jvy0Var.f) && this.g == jvy0Var.g && this.h.equals(jvy0Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iF = cy30.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
        String str2 = this.d;
        int iHashCode2 = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iD = cy30.d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
        int i = this.g;
        return this.h.hashCode() + ((iD + (i != 0 ? l1d.C(i) : 0)) * 31);
    }
}
