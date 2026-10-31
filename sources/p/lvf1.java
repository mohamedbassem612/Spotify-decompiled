package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lvf1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public lvf1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static lvf1 a(lvf1 lvf1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            z = lvf1Var.a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = lvf1Var.b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = lvf1Var.c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = lvf1Var.d;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = lvf1Var.e;
        }
        return new lvf1(z6, z7, z8, z9, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvf1)) {
            return false;
        }
        lvf1 lvf1Var = (lvf1) obj;
        return this.a == lvf1Var.a && this.b == lvf1Var.b && this.c == lvf1Var.c && this.d == lvf1Var.d && this.e == lvf1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
