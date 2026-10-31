package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lp90 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final jp90 f;
    public final jp90 g;

    public lp90(String str, String str2, int i, int i2, boolean z, jp90 jp90Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = jp90Var;
        this.g = jp90Var;
    }

    public final jp90 a() {
        return this.g;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp90)) {
            return false;
        }
        lp90 lp90Var = (lp90) obj;
        return u890.j(this.a, lp90Var.a) && u890.j(this.b, lp90Var.b) && this.c == lp90Var.c && this.d == lp90Var.d && this.e == lp90Var.e && this.f.equals(lp90Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(ab80.k(this.d, ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
    }
}
