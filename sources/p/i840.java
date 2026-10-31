package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i840 implements l840 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;

    public i840(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = z;
    }

    @Override // p.l840
    public final boolean a() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i840)) {
            return false;
        }
        i840 i840Var = (i840) obj;
        return this.a.equals(i840Var.a) && this.b.equals(i840Var.b) && this.c.equals(i840Var.c) && this.d.equals(i840Var.d) && this.e.equals(i840Var.e) && u890.j(this.f, i840Var.f) && u890.j(this.g, i840Var.g) && u890.j(this.h, i840Var.h) && u890.j(this.i, i840Var.i) && this.j == i840Var.j;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return Boolean.hashCode(this.j) + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
