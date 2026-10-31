package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o5g1 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public o5g1(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = str3;
        this.g = z3;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5g1)) {
            return false;
        }
        o5g1 o5g1Var = (o5g1) obj;
        return this.a.equals(o5g1Var.a) && this.b.equals(o5g1Var.b) && this.c == o5g1Var.c && this.d == o5g1Var.d && this.e == o5g1Var.e && u890.j(this.f, o5g1Var.f) && this.g == o5g1Var.g && this.h == o5g1Var.h;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.h) + xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
    }
}
