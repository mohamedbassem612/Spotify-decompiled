package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f2n0 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public f2n0(int i, int i2, String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2n0)) {
            return false;
        }
        f2n0 f2n0Var = (f2n0) obj;
        return u890.j(this.a, f2n0Var.a) && this.b == f2n0Var.b && this.c == f2n0Var.c && u890.j(this.d, f2n0Var.d) && this.e == f2n0Var.e && this.f == f2n0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(cy30.d(kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }
}
