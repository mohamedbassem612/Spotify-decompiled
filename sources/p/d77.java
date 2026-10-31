package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d77 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public d77(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d77)) {
            return false;
        }
        d77 d77Var = (d77) obj;
        return u890.j(this.a, d77Var.a) && u890.j(this.b, d77Var.b) && this.c == d77Var.c && u890.j(this.d, d77Var.d) && u890.j(this.e, d77Var.e) && u890.j(this.f, d77Var.f) && u890.j(this.g, d77Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
