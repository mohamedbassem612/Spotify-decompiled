package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w1l {
    public final float a;
    public final float b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final h3l f;

    public w1l(float f, float f2, boolean z, boolean z2, boolean z3, h3l h3lVar) {
        this.a = f;
        this.b = f2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = h3lVar;
    }

    public final float a() {
        return this.a;
    }

    public final boolean b() {
        return this.e;
    }

    public final float c() {
        return this.b;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1l)) {
            return false;
        }
        w1l w1lVar = (w1l) obj;
        return p3v.c(this.a, w1lVar.a) && p3v.c(this.b, w1lVar.b) && this.c == w1lVar.c && this.d == w1lVar.d && this.e == w1lVar.e && u890.j(this.f, w1lVar.f);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        this.f.getClass();
        return iG + 726388953;
    }

    public w1l() {
        this(40.0f, 24.0f, true, false, true, h3l.a);
    }
}
