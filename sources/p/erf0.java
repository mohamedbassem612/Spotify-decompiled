package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class erf0 {
    public final drf0 a;
    public final int b;
    public final bff0 c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public erf0(drf0 drf0Var, int i, bff0 bff0Var, int i2, boolean z, boolean z2) {
        this.a = drf0Var;
        this.b = i;
        this.c = bff0Var;
        this.d = i2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erf0)) {
            return false;
        }
        erf0 erf0Var = (erf0) obj;
        return this.a.equals(erf0Var.a) && this.b == erf0Var.b && u890.j(this.c, erf0Var.c) && this.d == erf0Var.d && this.e == erf0Var.e && this.f == erf0Var.f && Float.compare(16.0f, 16.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(16.0f) + xcg1.g(xcg1.g(ab80.k(this.d, (this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e), 31, this.f);
    }
}
