package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class um20 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public um20(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um20)) {
            return false;
        }
        um20 um20Var = (um20) obj;
        return this.a == um20Var.a && this.b == um20Var.b && this.c.equals(um20Var.c) && this.d == um20Var.d && this.e == um20Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(cy30.d(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
