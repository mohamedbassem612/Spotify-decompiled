package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class saz {
    public final long a;
    public final long b;
    public final float c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final iix0 h;

    public saz(long j, long j2, float f, boolean z, int i, int i2, boolean z2, iix0 iix0Var, int i3) {
        j = (i3 & 1) != 0 ? 0L : j;
        j2 = (i3 & 2) != 0 ? 0L : j2;
        z = (i3 & 8) != 0 ? false : z;
        iix0Var = (i3 & 256) != 0 ? null : iix0Var;
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.g = z2;
        this.h = iix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof saz)) {
            return false;
        }
        saz sazVar = (saz) obj;
        return this.a == sazVar.a && this.b == sazVar.b && Float.compare(this.c, sazVar.c) == 0 && this.d == sazVar.d && this.e == sazVar.e && this.f == sazVar.f && this.g == sazVar.g && u890.j(this.h, sazVar.h);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(ab80.k(this.f, ab80.k(this.e, xcg1.g(x0d.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), 31, this.c), 31, this.d), 31), 31), 31, true), 31, this.g);
        iix0 iix0Var = this.h;
        return iG + (iix0Var == null ? 0 : iix0Var.hashCode());
    }
}
