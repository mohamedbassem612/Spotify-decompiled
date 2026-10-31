package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wgh1 {
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final boolean f;
    public final int g;
    public final int h;

    public wgh1(int i, int i2, int i3, float f, float f2, boolean z, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = i4;
        this.h = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgh1)) {
            return false;
        }
        wgh1 wgh1Var = (wgh1) obj;
        return this.a == wgh1Var.a && this.b == wgh1Var.b && this.c == wgh1Var.c && p3v.c(this.d, wgh1Var.d) && p3v.c(this.e, wgh1Var.e) && this.f == wgh1Var.f && this.g == wgh1Var.g && this.h == wgh1Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + kaa0.f(this.g, xcg1.g(x0d.f(x0d.f(ab80.k(this.c, ab80.k(this.b, l1d.C(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31);
    }
}
