package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qhz0 {
    public final float a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public qhz0(float f, int i, boolean z, boolean z2, float f2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = f;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = f2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhz0)) {
            return false;
        }
        qhz0 qhz0Var = (qhz0) obj;
        return p3v.c(this.a, qhz0Var.a) && this.b == qhz0Var.b && this.c == qhz0Var.c && this.d == qhz0Var.d && Float.compare(this.e, qhz0Var.e) == 0 && this.f == qhz0Var.f && this.g == qhz0Var.g && this.h == qhz0Var.h && this.i == qhz0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + xcg1.g(xcg1.g(xcg1.g(x0d.f(xcg1.g(xcg1.g(kaa0.f(this.b, Float.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
