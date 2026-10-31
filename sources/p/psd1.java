package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class psd1 {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;

    public psd1(String str, String str2, Integer num, String str3, String str4, boolean z, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psd1)) {
            return false;
        }
        psd1 psd1Var = (psd1) obj;
        return u890.j(this.a, psd1Var.a) && u890.j(this.b, psd1Var.b) && u890.j(this.c, psd1Var.c) && u890.j(this.d, psd1Var.d) && u890.j(this.e, psd1Var.e) && this.f == psd1Var.f && u890.j(this.g, psd1Var.g) && u890.j(this.h, psd1Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.h.hashCode() + cy30.d(xcg1.g((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }
}
