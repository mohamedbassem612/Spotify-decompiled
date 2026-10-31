package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tul1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;

    public tul1(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = str6;
        this.h = z2;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tul1)) {
            return false;
        }
        tul1 tul1Var = (tul1) obj;
        return u890.j(this.a, tul1Var.a) && u890.j(this.b, tul1Var.b) && u890.j(this.c, tul1Var.c) && u890.j(this.d, tul1Var.d) && this.e == tul1Var.e && u890.j(this.f, tul1Var.f) && u890.j(this.g, tul1Var.g) && this.h == tul1Var.h && u890.j(this.i, tul1Var.i);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iG2 = xcg1.g(cy30.d((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h);
        String str2 = this.i;
        return iG2 + (str2 != null ? str2.hashCode() : 0);
    }
}
