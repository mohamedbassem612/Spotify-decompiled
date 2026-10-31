package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ltj1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final String i;
    public final int j;
    public final String k = "";

    public ltj1(String str, String str2, boolean z, String str3, String str4, String str5, long j, long j2, String str6, int i) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = j;
        this.h = j2;
        this.i = str6;
        this.j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltj1)) {
            return false;
        }
        ltj1 ltj1Var = (ltj1) obj;
        return u890.j(this.a, ltj1Var.a) && u890.j(this.b, ltj1Var.b) && this.c == ltj1Var.c && u890.j(this.d, ltj1Var.d) && u890.j(this.e, ltj1Var.e) && u890.j(this.f, ltj1Var.f) && this.g == ltj1Var.g && this.h == ltj1Var.h && u890.j(this.i, ltj1Var.i) && this.j == ltj1Var.j && this.k.equals(ltj1Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + xcg1.g(ab80.k(this.j, cy30.d(cy30.f(cy30.f(cy30.f(cy30.d(cy30.d(cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), this.g, 31), this.h, 31), 0L, 31), 31, this.i), 31), 31, false);
    }
}
