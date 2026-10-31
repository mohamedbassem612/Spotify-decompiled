package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ab6 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final double e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public ab6(String str, String str2, String str3, long j, double d, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = d;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab6)) {
            return false;
        }
        ab6 ab6Var = (ab6) obj;
        return this.a.equals(ab6Var.a) && this.b.equals(ab6Var.b) && this.c.equals(ab6Var.c) && this.d == ab6Var.d && Double.compare(this.e, ab6Var.e) == 0 && this.f == ab6Var.f && this.g == ab6Var.g && this.h == ab6Var.h && this.i == ab6Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + xcg1.g(xcg1.g(xcg1.g(xcg1.e(this.e, cy30.f(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), 31), 31, this.f), 31, this.g), 31, this.h);
    }
}
