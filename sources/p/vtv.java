package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vtv {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final boolean n;

    public vtv(String str, boolean z, String str2, boolean z2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str4, boolean z9, boolean z10) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
        this.e = str3;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = str4;
        this.m = z9;
        this.n = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtv)) {
            return false;
        }
        vtv vtvVar = (vtv) obj;
        return u890.j(this.a, vtvVar.a) && this.b == vtvVar.b && u890.j(this.c, vtvVar.c) && this.d == vtvVar.d && u890.j(this.e, vtvVar.e) && this.f == vtvVar.f && this.g == vtvVar.g && this.h == vtvVar.h && this.i == vtvVar.i && this.j == vtvVar.j && this.k == vtvVar.k && u890.j(this.l, vtvVar.l) && this.m == vtvVar.m && this.n == vtvVar.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + xcg1.g(cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(xcg1.g(cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }
}
