package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q9g0 {
    public final String a;
    public final cww0 b;
    public final int c;
    public final boolean d;
    public final int e;
    public final exr0 f;
    public final e850 g;
    public final i9t0 h;
    public final l6t i;

    public q9g0(String str, cww0 cww0Var, int i, boolean z, int i2, exr0 exr0Var, e850 e850Var, i9t0 i9t0Var, l6t l6tVar) {
        this.a = str;
        this.b = cww0Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = exr0Var;
        this.g = e850Var;
        this.h = i9t0Var;
        this.i = l6tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9g0)) {
            return false;
        }
        q9g0 q9g0Var = (q9g0) obj;
        return this.a.equals(q9g0Var.a) && this.b.equals(q9g0Var.b) && this.c == q9g0Var.c && this.d == q9g0Var.d && this.e == q9g0Var.e && u890.j(this.f, q9g0Var.f) && u890.j(this.g, q9g0Var.g) && u890.j(this.h, q9g0Var.h) && this.i.equals(q9g0Var.i);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.e, xcg1.g(ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31);
        exr0 exr0Var = this.f;
        int iHashCode = (iF + (exr0Var == null ? 0 : exr0Var.hashCode())) * 31;
        e850 e850Var = this.g;
        int iHashCode2 = (iHashCode + (e850Var == null ? 0 : Integer.hashCode(e850Var.a))) * 31;
        i9t0 i9t0Var = this.h;
        return l1d.C(this.i.a) + ((iHashCode2 + (i9t0Var != null ? i9t0Var.hashCode() : 0)) * 31);
    }
}
