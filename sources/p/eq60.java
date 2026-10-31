package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eq60 {
    public final dq60 a;
    public int b = 1;
    public final long c;
    public long d;
    public long e;
    public long f;

    public eq60(dq60 dq60Var, long j) {
        this.a = dq60Var;
        this.c = j;
        this.d = j;
        this.e = j;
        this.f = j;
    }

    public final dq60 a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.f;
    }

    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq60)) {
            return false;
        }
        eq60 eq60Var = (eq60) obj;
        return this.a.equals(eq60Var.a) && this.b == eq60Var.b && this.c == eq60Var.c && this.d == eq60Var.d && this.e == eq60Var.e && this.f == eq60Var.f;
    }

    public final long f() {
        return this.d;
    }

    public final void g(int i) {
        this.b = i;
    }

    public final void h(long j) {
        this.f = j;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + cy30.f(cy30.f(cy30.f(ab80.k(this.b, this.a.a.hashCode() * 31, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    public final void i(long j) {
        this.e = j;
    }

    public final void j(long j) {
        this.d = j;
    }
}
