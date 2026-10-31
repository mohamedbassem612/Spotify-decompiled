package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eyb0 {
    public final vxb0 a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final d3d1 g;
    public final dyb0 h;

    public eyb0(vxb0 vxb0Var, int i, int i2, boolean z, boolean z2, boolean z3, d3d1 d3d1Var, dyb0 dyb0Var) {
        this.a = vxb0Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = d3d1Var;
        this.h = dyb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyb0)) {
            return false;
        }
        eyb0 eyb0Var = (eyb0) obj;
        return this.a.equals(eyb0Var.a) && this.b == eyb0Var.b && this.c == eyb0Var.c && this.d == eyb0Var.d && this.e == eyb0Var.e && this.f == eyb0Var.f && this.g == eyb0Var.g && u890.j(this.h, eyb0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }
}
