package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z800 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public z800(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z800)) {
            return false;
        }
        z800 z800Var = (z800) obj;
        return this.a.equals(z800Var.a) && this.b.equals(z800Var.b) && this.c.equals(z800Var.c) && u890.j(this.d, z800Var.d) && u890.j(this.e, z800Var.e) && this.f.equals(z800Var.f) && this.g.equals(z800Var.g) && this.h.equals(z800Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 29791, this.b), 31, false), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(false) + xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g), 961, this.h), 29791, false), 31, false);
    }
}
