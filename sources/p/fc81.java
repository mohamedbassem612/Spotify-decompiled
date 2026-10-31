package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fc81 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public fc81(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
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
        if (!(obj instanceof fc81)) {
            return false;
        }
        fc81 fc81Var = (fc81) obj;
        return this.a.equals(fc81Var.a) && this.b.equals(fc81Var.b) && this.c.equals(fc81Var.c) && this.d.equals(fc81Var.d) && this.e.equals(fc81Var.e) && u890.j(this.f, fc81Var.f) && this.g.equals(fc81Var.g) && u890.j(this.h, fc81Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iD2 = cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        return iD2 + (str2 != null ? str2.hashCode() : 0);
    }
}
