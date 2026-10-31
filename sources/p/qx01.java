package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qx01 implements ux01 {
    public final String a;
    public final int b;
    public final c380 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public qx01(String str, int i, int i2, boolean z) {
        this(str, i, fg91.b, false, false, (i2 & 32) != 0 ? false : z);
    }

    public static qx01 a(qx01 qx01Var, c380 c380Var, boolean z, boolean z2, int i) {
        String str = qx01Var.a;
        int i2 = qx01Var.b;
        if ((i & 4) != 0) {
            c380Var = qx01Var.c;
        }
        c380 c380Var2 = c380Var;
        if ((i & 8) != 0) {
            z = qx01Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = qx01Var.e;
        }
        return new qx01(str, i2, c380Var2, z3, z2, qx01Var.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx01)) {
            return false;
        }
        qx01 qx01Var = (qx01) obj;
        return u890.j(this.a, qx01Var.a) && this.b == qx01Var.b && u890.j(this.c, qx01Var.c) && this.d == qx01Var.d && this.e == qx01Var.e && this.f == qx01Var.f;
    }

    @Override // p.ux01
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(kk0.f(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public qx01(String str, int i, c380 c380Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = i;
        this.c = c380Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }
}
