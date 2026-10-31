package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class np90 {
    public final String a;
    public final hp90 b;
    public final boolean c;
    public final boolean d;
    public final dp90 e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public np90(String str, hp90 hp90Var, boolean z, boolean z2, dp90 dp90Var, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = str;
        this.b = hp90Var;
        this.c = z;
        this.d = z2;
        this.e = dp90Var;
        this.f = i;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np90)) {
            return false;
        }
        np90 np90Var = (np90) obj;
        return this.a.equals(np90Var.a) && this.b.equals(np90Var.b) && this.c == np90Var.c && this.d == np90Var.d && u890.j(this.e, np90Var.e) && this.f == np90Var.f && this.g == np90Var.g && this.h == np90Var.h && this.i == np90Var.i && this.j == np90Var.j && this.k == np90Var.k;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        dp90 dp90Var = this.e;
        return Boolean.hashCode(this.k) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.f, (iG + (dp90Var == null ? 0 : dp90Var.hashCode())) * 31, 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }
}
