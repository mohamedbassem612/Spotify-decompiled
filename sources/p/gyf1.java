package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gyf1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;

    public gyf1(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = z;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyf1)) {
            return false;
        }
        gyf1 gyf1Var = (gyf1) obj;
        return u890.j(this.a, gyf1Var.a) && u890.j(this.b, gyf1Var.b) && u890.j(this.c, gyf1Var.c) && u890.j(this.d, gyf1Var.d) && u890.j(this.e, gyf1Var.e) && u890.j(this.f, gyf1Var.f) && u890.j(this.g, gyf1Var.g) && this.h == gyf1Var.h && this.i == gyf1Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
