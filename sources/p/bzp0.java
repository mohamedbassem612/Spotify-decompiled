package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bzp0 {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public bzp0(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = j5;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzp0)) {
            return false;
        }
        bzp0 bzp0Var = (bzp0) obj;
        return this.a == bzp0Var.a && this.b == bzp0Var.b && this.c == bzp0Var.c && this.d == bzp0Var.d && this.e == bzp0Var.e && this.f == bzp0Var.f && this.g == bzp0Var.g && this.h == bzp0Var.h && this.i == bzp0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31);
    }
}
