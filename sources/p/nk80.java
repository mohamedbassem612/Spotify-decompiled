package p;

import android.graphics.Insets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nk80 {
    public static final nk80 e = new nk80(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public nk80(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static nk80 a(nk80 nk80Var, nk80 nk80Var2) {
        return c(Math.max(nk80Var.a, nk80Var2.a), Math.max(nk80Var.b, nk80Var2.b), Math.max(nk80Var.c, nk80Var2.c), Math.max(nk80Var.d, nk80Var2.d));
    }

    public static nk80 b(nk80 nk80Var, nk80 nk80Var2) {
        return c(Math.min(nk80Var.a, nk80Var2.a), Math.min(nk80Var.b, nk80Var2.b), Math.min(nk80Var.c, nk80Var2.c), Math.min(nk80Var.d, nk80Var2.d));
    }

    public static nk80 c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new nk80(i, i2, i3, i4);
    }

    public static nk80 d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return d55.f(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nk80.class != obj.getClass()) {
            return false;
        }
        nk80 nk80Var = (nk80) obj;
        return this.d == nk80Var.d && this.a == nk80Var.a && this.c == nk80Var.c && this.b == nk80Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return l1d.o(sb, this.d, '}');
    }
}
