package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r7k0 {
    public final String a;
    public final lhg1 b;
    public final boolean c;
    public final Float d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public r7k0(String str, lhg1 lhg1Var, boolean z, Float f, boolean z2, boolean z3, int i) {
        this.a = str;
        this.b = lhg1Var;
        this.c = z;
        this.d = f;
        this.e = z2;
        this.f = z3;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7k0)) {
            return false;
        }
        r7k0 r7k0Var = (r7k0) obj;
        return u890.j(this.a, r7k0Var.a) && u890.j(this.b, r7k0Var.b) && this.c == r7k0Var.c && u890.j(this.d, r7k0Var.d) && this.e == r7k0Var.e && this.f == r7k0Var.f && this.g == r7k0Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        lhg1 lhg1Var = this.b;
        int iG = xcg1.g((iHashCode + (lhg1Var == null ? 0 : lhg1Var.hashCode())) * 31, 31, this.c);
        Float f = this.d;
        return l1d.C(this.g) + xcg1.g(xcg1.g((iG + (f != null ? f.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public /* synthetic */ r7k0(String str, lhg1 lhg1Var, Float f, int i) {
        this(str, lhg1Var, true, (i & 8) != 0 ? null : f, false, false, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r7k0(String str) {
        lhg1 lhg1Var = null;
        this(str, lhg1Var, lhg1Var, 120);
    }

    public r7k0(String str, Float f) {
        this(str, null, f, 112);
    }
}
