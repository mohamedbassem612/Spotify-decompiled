package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class en0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final dn0 g;

    public en0(int i, int i2, int i3, int i4, int i5, int i6, dn0 dn0Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = dn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en0)) {
            return false;
        }
        en0 en0Var = (en0) obj;
        return this.a == en0Var.a && this.b == en0Var.b && this.c == en0Var.c && this.d == en0Var.d && this.e == en0Var.e && this.f == en0Var.f && this.g.equals(en0Var.g);
    }

    public final int hashCode() {
        return Integer.hashCode(this.g.a) + ab80.k(this.f, kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }
}
