package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j20 implements k20 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public j20(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j20)) {
            return false;
        }
        j20 j20Var = (j20) obj;
        return this.a.equals(j20Var.a) && this.b.equals(j20Var.b) && u890.j(this.c, j20Var.c) && this.d.equals(j20Var.d) && this.e.equals(j20Var.e) && this.f.equals(j20Var.f) && this.g.equals(j20Var.g) && this.h.equals(j20Var.h) && this.i.equals(j20Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.i.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
