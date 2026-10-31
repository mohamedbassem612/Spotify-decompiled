package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y9z {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final iix0 i;

    public y9z(String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, iix0 iix0Var) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = iix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9z)) {
            return false;
        }
        y9z y9zVar = (y9z) obj;
        return this.a.equals(y9zVar.a) && this.b == y9zVar.b && this.c == y9zVar.c && this.d == y9zVar.d && this.e == y9zVar.e && this.f == y9zVar.f && this.g == y9zVar.g && this.h == y9zVar.h && u890.j(this.i, y9zVar.i);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        iix0 iix0Var = this.i;
        return iG + (iix0Var == null ? 0 : iix0Var.hashCode());
    }
}
