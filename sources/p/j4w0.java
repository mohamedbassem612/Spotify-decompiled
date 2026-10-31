package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j4w0 {
    public final i4w0 a;
    public final String b;
    public final hzn c;
    public final String d;
    public final q4w0 e;
    public final boolean f;
    public final ian g;
    public final tfn0 h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public final boolean l;

    public j4w0(i4w0 i4w0Var, String str, hzn hznVar, String str2, q4w0 q4w0Var, boolean z, ian ianVar, tfn0 tfn0Var, boolean z2, int i, boolean z3, boolean z4) {
        this.a = i4w0Var;
        this.b = str;
        this.c = hznVar;
        this.d = str2;
        this.e = q4w0Var;
        this.f = z;
        this.g = ianVar;
        this.h = tfn0Var;
        this.i = z2;
        this.j = i;
        this.k = z3;
        this.l = z4;
    }

    public static j4w0 a(j4w0 j4w0Var, int i) {
        i4w0 i4w0Var = j4w0Var.a;
        String str = j4w0Var.b;
        hzn hznVar = j4w0Var.c;
        String str2 = j4w0Var.d;
        q4w0 q4w0Var = j4w0Var.e;
        boolean z = j4w0Var.f;
        ian ianVar = j4w0Var.g;
        tfn0 tfn0Var = j4w0Var.h;
        boolean z2 = j4w0Var.i;
        boolean z3 = j4w0Var.k;
        boolean z4 = j4w0Var.l;
        j4w0Var.getClass();
        return new j4w0(i4w0Var, str, hznVar, str2, q4w0Var, z, ianVar, tfn0Var, z2, i, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4w0)) {
            return false;
        }
        j4w0 j4w0Var = (j4w0) obj;
        return this.a.equals(j4w0Var.a) && this.b.equals(j4w0Var.b) && this.c.equals(j4w0Var.c) && this.d.equals(j4w0Var.d) && this.e.equals(j4w0Var.e) && this.f == j4w0Var.f && this.g.equals(j4w0Var.g) && this.h.equals(j4w0Var.h) && this.i == j4w0Var.i && this.j == j4w0Var.j && this.k == j4w0Var.k && this.l == j4w0Var.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + xcg1.g(kaa0.f(this.j, xcg1.g(xcg1.g((this.g.hashCode() + xcg1.g((this.e.hashCode() + cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31, 31, this.f)) * 31, 31, this.h.a), 31, this.i), 31), 31, this.k);
    }
}
