package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aqf1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final zpf1 f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;

    public aqf1(String str, String str2, boolean z, String str3, String str4, zpf1 zpf1Var, String str5, String str6, String str7, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = zpf1Var;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqf1)) {
            return false;
        }
        aqf1 aqf1Var = (aqf1) obj;
        return this.a.equals(aqf1Var.a) && this.b.equals(aqf1Var.b) && this.c == aqf1Var.c && this.d.equals(aqf1Var.d) && this.e.equals(aqf1Var.e) && this.f.equals(aqf1Var.f) && u890.j(this.g, aqf1Var.g) && u890.j(this.h, aqf1Var.h) && u890.j(this.i, aqf1Var.i) && this.j == aqf1Var.j;
    }

    public final int hashCode() {
        int iD = cy30.d((this.f.hashCode() + cy30.d(cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
        String str = this.h;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return Boolean.hashCode(this.j) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
