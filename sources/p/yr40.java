package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yr40 extends as40 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;

    public yr40(int i, int i2, String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr40)) {
            return false;
        }
        yr40 yr40Var = (yr40) obj;
        return u890.j(this.a, yr40Var.a) && u890.j(this.b, yr40Var.b) && this.c == yr40Var.c && u890.j(this.d, yr40Var.d) && this.e == yr40Var.e && this.f == yr40Var.f && u890.j(this.g, yr40Var.g);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.f, kaa0.f(this.e, cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
        String str = this.g;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
