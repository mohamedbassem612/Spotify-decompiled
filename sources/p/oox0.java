package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oox0 implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final nox0 i;
    public final nox0 j;
    public final String k;

    public oox0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, nox0 nox0Var, nox0 nox0Var2, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = nox0Var;
        this.j = nox0Var2;
        this.k = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oox0)) {
            return false;
        }
        oox0 oox0Var = (oox0) obj;
        return this.a.equals(oox0Var.a) && this.b.equals(oox0Var.b) && this.c.equals(oox0Var.c) && this.d.equals(oox0Var.d) && this.e.equals(oox0Var.e) && u890.j(this.f, oox0Var.f) && this.g.equals(oox0Var.g) && u890.j(this.h, oox0Var.h) && this.i.equals(oox0Var.i) && this.j.equals(oox0Var.j) && u890.j(this.k, oox0Var.k);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iD2 = cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        int iHashCode = (this.j.hashCode() + ((this.i.hashCode() + ((iD2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        String str3 = this.k;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
