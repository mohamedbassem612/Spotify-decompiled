package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gd61 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public gd61(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd61)) {
            return false;
        }
        gd61 gd61Var = (gd61) obj;
        return this.a == gd61Var.a && this.b == gd61Var.b && this.c == gd61Var.c && this.d == gd61Var.d && this.e == gd61Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(xcg1.g(l1d.C(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
