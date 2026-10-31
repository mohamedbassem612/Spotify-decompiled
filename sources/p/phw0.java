package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class phw0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final boolean f;
    public final float g;
    public final boolean h;

    public phw0(String str, String str2, int i, int i2, String str3, boolean z, float f, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = z;
        this.g = f;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phw0)) {
            return false;
        }
        phw0 phw0Var = (phw0) obj;
        return u890.j(this.a, phw0Var.a) && u890.j(this.b, phw0Var.b) && this.c == phw0Var.c && this.d == phw0Var.d && u890.j(this.e, phw0Var.e) && this.f == phw0Var.f && Float.compare(this.g, phw0Var.g) == 0 && this.h == phw0Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.h) + x0d.f(xcg1.g(cy30.d(ab80.k(this.d, ab80.k(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }
}
