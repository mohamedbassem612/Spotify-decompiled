package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s6f {
    public final t7q0 a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public s6f(t7q0 t7q0Var, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = t7q0Var;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6f)) {
            return false;
        }
        s6f s6fVar = (s6f) obj;
        return u890.j(this.a, s6fVar.a) && this.b == s6fVar.b && this.c == s6fVar.c && this.d == s6fVar.d && this.e == s6fVar.e && this.f == s6fVar.f;
    }

    public final int hashCode() {
        t7q0 t7q0Var = this.a;
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(xcg1.g(ab80.k(this.b, (t7q0Var == null ? 0 : t7q0Var.hashCode()) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }
}
