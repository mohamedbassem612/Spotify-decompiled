package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h5h {
    public final String a;
    public final int b;
    public final c380 c;
    public final y0q0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final float h;

    public h5h(String str, int i, c380 c380Var, y0q0 y0q0Var, boolean z, boolean z2, int i2) {
        boolean z3 = (i2 & 16) != 0;
        z2 = (i2 & 64) != 0 ? false : z2;
        float f = (i2 & 128) != 0 ? l5h.b : 0.0f;
        this.a = str;
        this.b = i;
        this.c = c380Var;
        this.d = y0q0Var;
        this.e = z3;
        this.f = z;
        this.g = z2;
        this.h = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5h)) {
            return false;
        }
        h5h h5hVar = (h5h) obj;
        return u890.j(this.a, h5hVar.a) && this.b == h5hVar.b && u890.j(this.c, h5hVar.c) && u890.j(this.d, h5hVar.d) && this.e == h5hVar.e && this.f == h5hVar.f && this.g == h5hVar.g && p3v.c(this.h, h5hVar.h);
    }

    public final int hashCode() {
        int iF = kk0.f(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31);
        y0q0 y0q0Var = this.d;
        return Float.hashCode(this.h) + xcg1.g(xcg1.g(xcg1.g((iF + (y0q0Var == null ? 0 : y0q0Var.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
    }
}
