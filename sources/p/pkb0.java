package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pkb0 {
    public final nbm1 a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final boolean g;
    public final eza h;
    public final int i;
    public final boolean j;

    public /* synthetic */ pkb0(nbm1 nbm1Var, float f, float f2, float f3, float f4, float f5, dza dzaVar, int i, int i2) {
        this(nbm1Var, f, f2, f3, f4, (i2 & 32) != 0 ? 0.0f : f5, (i2 & 64) == 0, (i2 & 128) != 0 ? cza.a : dzaVar, (i2 & 256) != 0 ? 1 : i, (i2 & 512) != 0);
    }

    public static pkb0 a(pkb0 pkb0Var, float f, float f2, float f3, float f4, int i) {
        nbm1 nbm1Var = pkb0Var.a;
        if ((i & 2) != 0) {
            f = pkb0Var.b;
        }
        float f5 = f;
        if ((i & 4) != 0) {
            f2 = pkb0Var.c;
        }
        float f6 = f2;
        if ((i & 8) != 0) {
            f3 = pkb0Var.d;
        }
        return new pkb0(nbm1Var, f5, f6, f3, (i & 16) != 0 ? pkb0Var.e : f4, pkb0Var.f, pkb0Var.g, pkb0Var.h, (i & 256) != 0 ? pkb0Var.i : 5, pkb0Var.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkb0)) {
            return false;
        }
        pkb0 pkb0Var = (pkb0) obj;
        return this.a == pkb0Var.a && p3v.c(this.b, pkb0Var.b) && p3v.c(this.c, pkb0Var.c) && p3v.c(this.d, pkb0Var.d) && p3v.c(this.e, pkb0Var.e) && Float.compare(this.f, pkb0Var.f) == 0 && this.g == pkb0Var.g && u890.j(this.h, pkb0Var.h) && this.i == pkb0Var.i && this.j == pkb0Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ab80.k(this.i, (this.h.hashCode() + xcg1.g(x0d.f(x0d.f(x0d.f(x0d.f(x0d.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31);
    }

    public pkb0(nbm1 nbm1Var, float f, float f2, float f3, float f4, float f5, boolean z, eza ezaVar, int i, boolean z2) {
        this.a = nbm1Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = z;
        this.h = ezaVar;
        this.i = i;
        this.j = z2;
    }
}
