package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x1l {
    public final c2l a;
    public final boolean b;
    public final float c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public x1l(c2l c2lVar, boolean z, float f, float f2, boolean z2, boolean z3, int i) {
        this.a = c2lVar;
        this.b = z;
        this.c = f;
        this.d = f2;
        this.e = z2;
        this.f = z3;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1l)) {
            return false;
        }
        x1l x1lVar = (x1l) obj;
        return u890.j(this.a, x1lVar.a) && this.b == x1lVar.b && p3v.c(this.c, x1lVar.c) && p3v.c(this.d, x1lVar.d) && this.e == x1lVar.e && this.f == x1lVar.f && this.g == x1lVar.g;
    }

    public final int hashCode() {
        return l1d.C(this.g) + xcg1.g(xcg1.g(x0d.f(x0d.f(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public /* synthetic */ x1l(c2l c2lVar, boolean z, float f, float f2, boolean z2, boolean z3, int i, int i2) {
        this(c2lVar, z, f, f2, z2, z3, i);
    }
}
