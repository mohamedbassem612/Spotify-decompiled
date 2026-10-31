package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ur21 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;

    public ur21(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = i;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur21)) {
            return false;
        }
        ur21 ur21Var = (ur21) obj;
        return u890.j(this.a, ur21Var.a) && u890.j(this.b, ur21Var.b) && u890.j(this.c, ur21Var.c) && this.d.equals(ur21Var.d) && u890.j(this.e, ur21Var.e) && u890.j(this.f, ur21Var.f) && this.g.equals(ur21Var.g) && u890.j(this.h, ur21Var.h) && this.i == ur21Var.i && this.j == ur21Var.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + kaa0.f(this.i, cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31);
    }
}
