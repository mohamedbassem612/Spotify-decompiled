package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pvb1 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public pvb1(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static pvb1 a(pvb1 pvb1Var, int i, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            i = pvb1Var.a;
        }
        if ((i2 & 2) != 0) {
            z = pvb1Var.b;
        }
        if ((i2 & 4) != 0) {
            z2 = pvb1Var.c;
        }
        boolean z3 = (i2 & 8) != 0 ? pvb1Var.d : false;
        pvb1Var.getClass();
        return new pvb1(i, z, z2, z3);
    }

    public final boolean b() {
        return this.a != 0 || this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvb1)) {
            return false;
        }
        pvb1 pvb1Var = (pvb1) obj;
        return this.a == pvb1Var.a && this.b == pvb1Var.b && this.c == pvb1Var.c && this.d == pvb1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
