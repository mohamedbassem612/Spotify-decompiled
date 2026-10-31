package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zdj1 {
    public final String a;
    public final ydj1 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public zdj1(String str, ydj1 ydj1Var, boolean z, boolean z2, boolean z3, int i) {
        this.a = str;
        this.b = ydj1Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = i;
    }

    public static zdj1 a(zdj1 zdj1Var, boolean z, boolean z2, int i) {
        String str = zdj1Var.a;
        ydj1 ydj1Var = zdj1Var.b;
        if ((i & 4) != 0) {
            z = zdj1Var.c;
        }
        boolean z3 = z;
        boolean z4 = zdj1Var.d;
        if ((i & 16) != 0) {
            z2 = zdj1Var.e;
        }
        int i2 = zdj1Var.f;
        zdj1Var.getClass();
        return new zdj1(str, ydj1Var, z3, z4, z2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdj1)) {
            return false;
        }
        zdj1 zdj1Var = (zdj1) obj;
        return this.a.equals(zdj1Var.a) && this.b.equals(zdj1Var.b) && this.c == zdj1Var.c && this.d == zdj1Var.d && this.e == zdj1Var.e && this.f == zdj1Var.f;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        int i = this.f;
        return iG + (i == 0 ? 0 : l1d.C(i));
    }
}
