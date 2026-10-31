package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o6k0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ihh1 g;
    public final boolean h;
    public final boolean i;

    public o6k0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ihh1 ihh1Var, boolean z7, boolean z8) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = ihh1Var;
        this.h = z7;
        this.i = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6k0)) {
            return false;
        }
        o6k0 o6k0Var = (o6k0) obj;
        return this.a == o6k0Var.a && this.b == o6k0Var.b && this.c == o6k0Var.c && this.d == o6k0Var.d && this.e == o6k0Var.e && this.f == o6k0Var.f && this.g == o6k0Var.g && this.h == o6k0Var.h && this.i == o6k0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + xcg1.g((this.g.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h);
    }
}
