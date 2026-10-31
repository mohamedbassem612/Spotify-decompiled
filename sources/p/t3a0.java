package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t3a0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public t3a0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static t3a0 a(t3a0 t3a0Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = t3a0Var.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = t3a0Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = t3a0Var.c;
        }
        return new t3a0(z4, z5, z3, t3a0Var.d, t3a0Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3a0)) {
            return false;
        }
        t3a0 t3a0Var = (t3a0) obj;
        return this.a == t3a0Var.a && this.b == t3a0Var.b && this.c == t3a0Var.c && this.d == t3a0Var.d && this.e == t3a0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
