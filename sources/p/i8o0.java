package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i8o0 {
    public final int a;
    public final long b;
    public final long c;
    public final w7o0 d;
    public final ola1 e;
    public final Object f;

    public i8o0(int i, long j, long j2, w7o0 w7o0Var, ola1 ola1Var, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = w7o0Var;
        this.e = ola1Var;
        this.f = obj;
    }

    public final ola1 a() {
        return this.e;
    }

    public final int b() {
        return this.a;
    }

    public final w7o0 c() {
        return this.d;
    }

    public final long d() {
        return this.b;
    }

    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8o0)) {
            return false;
        }
        i8o0 i8o0Var = (i8o0) obj;
        return this.a == i8o0Var.a && this.b == i8o0Var.b && this.c == i8o0Var.c && u890.j(this.d, i8o0Var.d) && u890.j(this.e, i8o0Var.e) && u890.j(this.f, i8o0Var.f);
    }

    public final int hashCode() {
        int iE = cy30.e(cy30.f(cy30.f(this.a * 31, this.b, 31), this.c, 31), 31, this.d.a);
        ola1 ola1Var = this.e;
        int iHashCode = (iE + (ola1Var == null ? 0 : ola1Var.a.hashCode())) * 31;
        Object obj = this.f;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResponse(code=" + this.a + ", requestMillis=" + this.b + ", responseMillis=" + this.c + ", headers=" + this.d + ", body=" + this.e + ", delegate=" + this.f + ')';
    }

    public /* synthetic */ i8o0(int i, long j, long j2, w7o0 w7o0Var) {
        this(i, j, j2, w7o0Var, null, null);
    }
}
