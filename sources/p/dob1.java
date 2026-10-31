package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dob1 {
    public final i7e0 a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;

    public dob1(i7e0 i7e0Var, boolean z, boolean z2, int i, boolean z3) {
        this.a = i7e0Var;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dob1)) {
            return false;
        }
        dob1 dob1Var = (dob1) obj;
        return u890.j(this.a, dob1Var.a) && this.b == dob1Var.b && this.c == dob1Var.c && this.d == dob1Var.d && this.e == dob1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ab80.k(this.d, xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public /* synthetic */ dob1(i7e0 i7e0Var) {
        this(i7e0Var, true, false, 3, false);
    }
}
