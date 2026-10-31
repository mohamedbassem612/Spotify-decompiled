package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y0 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public y0(int i, int i2, int i3, boolean z, boolean z2) {
        z = (i3 & 4) != 0 ? false : z;
        boolean z3 = (i3 & 8) == 0;
        z2 = (i3 & 16) != 0 ? false : z2;
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z3;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.a == y0Var.a && this.b == y0Var.b && this.c == y0Var.c && this.d == y0Var.d && this.e == y0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(ab80.k(this.b, l1d.C(this.a) * 31, 31), 31, this.c), 31, this.d);
    }
}
