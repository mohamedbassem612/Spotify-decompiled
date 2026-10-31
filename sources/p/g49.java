package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g49 extends c0p1 {
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final fae1 g;
    public final boolean h;
    public final boolean i;

    public g49(boolean z, boolean z2, String str, boolean z3, fae1 fae1Var, boolean z4, boolean z5) {
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = z3;
        this.g = fae1Var;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g49)) {
            return false;
        }
        g49 g49Var = (g49) obj;
        return this.c == g49Var.c && this.d == g49Var.d && u890.j(this.e, g49Var.e) && this.f == g49Var.f && u890.j(this.g, g49Var.g) && this.h == g49Var.h && this.i == g49Var.i;
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.c) * 31, 31, this.d);
        String str = this.e;
        int iG2 = xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        fae1 fae1Var = this.g;
        return Boolean.hashCode(this.i) + xcg1.g((iG2 + (fae1Var != null ? fae1Var.hashCode() : 0)) * 31, 31, this.h);
    }
}
