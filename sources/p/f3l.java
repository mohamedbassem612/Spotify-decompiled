package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f3l {
    public final qim0 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final h3l j;

    public f3l(float f, int i, boolean z) {
        int i2 = (i & 2) != 0 ? 1 : 2;
        boolean z2 = (i & 4) == 0;
        float f2 = (i & 8) != 0 ? 30.0f : 16.0f;
        f = (i & 16) != 0 ? 20.0f : f;
        z = (i & 64) != 0 ? true : z;
        boolean z3 = (i & 1024) != 0;
        this.a = nim0.a;
        this.b = i2;
        this.c = z2;
        this.d = f2;
        this.e = f;
        this.f = true;
        this.g = z;
        this.h = false;
        this.i = z3;
        this.j = h3l.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3l)) {
            return false;
        }
        f3l f3lVar = (f3l) obj;
        return this.a.equals(f3lVar.a) && this.b == f3lVar.b && this.c == f3lVar.c && p3v.c(this.d, f3lVar.d) && p3v.c(this.e, f3lVar.e) && this.f == f3lVar.f && this.g == f3lVar.g && this.h == f3lVar.h && this.i == f3lVar.i && this.j.equals(f3lVar.j);
    }

    public final int hashCode() {
        return ((Boolean.hashCode(this.i) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(x0d.f(x0d.f(xcg1.g(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, true), 31, false)) * 31) + 726388953;
    }
}
