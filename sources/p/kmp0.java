package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kmp0 {
    public final o571 a;
    public final boolean b;
    public final boolean c;
    public final bb71 d;
    public final boolean e;

    static {
        idd1 idd1Var = o571.c;
    }

    public kmp0(o571 o571Var, boolean z, boolean z2, bb71 bb71Var, boolean z3) {
        this.a = o571Var;
        this.b = z;
        this.c = z2;
        this.d = bb71Var;
        this.e = z3;
    }

    public static kmp0 a(kmp0 kmp0Var, boolean z, boolean z2, bb71 bb71Var, boolean z3, int i) {
        boolean z4 = z;
        o571 o571Var = kmp0Var.a;
        if ((i & 2) != 0) {
            z4 = kmp0Var.b;
        }
        if ((i & 4) != 0) {
            z2 = kmp0Var.c;
        }
        if ((i & 8) != 0) {
            bb71Var = kmp0Var.d;
        }
        if ((i & 16) != 0) {
            z3 = kmp0Var.e;
        }
        boolean z5 = z3;
        kmp0Var.getClass();
        bb71 bb71Var2 = bb71Var;
        return new kmp0(o571Var, z4, z2, bb71Var2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmp0)) {
            return false;
        }
        kmp0 kmp0Var = (kmp0) obj;
        return u890.j(this.a, kmp0Var.a) && this.b == kmp0Var.b && this.c == kmp0Var.c && this.d.equals(kmp0Var.d) && this.e == kmp0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }
}
