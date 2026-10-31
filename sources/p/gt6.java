package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gt6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;

    public gt6(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, boolean z, boolean z2, int i2) {
        str2 = (i2 & 2) != 0 ? null : str2;
        str3 = (i2 & 4) != 0 ? null : str3;
        i = (i2 & 64) != 0 ? -1 : i;
        str7 = (i2 & 128) != 0 ? null : str7;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
        this.h = str7;
        this.i = str8;
        this.j = z;
        this.k = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt6)) {
            return false;
        }
        gt6 gt6Var = (gt6) obj;
        return u890.j(this.a, gt6Var.a) && u890.j(this.b, gt6Var.b) && u890.j(this.c, gt6Var.c) && u890.j(this.d, gt6Var.d) && this.e.equals(gt6Var.e) && this.f.equals(gt6Var.f) && this.g == gt6Var.g && u890.j(this.h, gt6Var.h) && u890.j(this.i, gt6Var.i) && this.j == gt6Var.j && this.k == gt6Var.k;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iF = kaa0.f(this.g, cy30.d(cy30.d((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.e), 31, this.f), 31);
        String str5 = this.h;
        int iHashCode4 = (iF + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        return Boolean.hashCode(this.k) + xcg1.g((iHashCode4 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.j);
    }
}
