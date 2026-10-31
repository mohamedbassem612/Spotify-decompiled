package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class myn0 {
    public final y6r0 a;
    public final long b;
    public final var0 c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public myn0(y6r0 y6r0Var, long j, var0 var0Var, List list, boolean z, boolean z2) {
        this.a = y6r0Var;
        this.b = j;
        this.c = var0Var;
        this.d = list;
        this.e = z;
        this.f = z2;
    }

    public final y6r0 a() {
        return this.a;
    }

    public final var0 b() {
        return this.c;
    }

    public final List c() {
        return this.d;
    }

    public final long d() {
        return this.b;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myn0)) {
            return false;
        }
        myn0 myn0Var = (myn0) obj;
        return u890.j(this.a, myn0Var.a) && this.b == myn0Var.b && u890.j(this.c, myn0Var.c) && u890.j(this.d, myn0Var.d) && this.e == myn0Var.e && this.f == myn0Var.f;
    }

    public final int hashCode() {
        int iF = cy30.f(this.a.a.hashCode() * 31, this.b, 31);
        var0 var0Var = this.c;
        return Boolean.hashCode(this.f) + xcg1.g(f4i1.b((iF + (var0Var == null ? 0 : var0Var.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
