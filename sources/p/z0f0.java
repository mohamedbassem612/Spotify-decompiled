package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z0f0 extends upf {
    public final l3f0 d;
    public final boolean e;
    public final xi01 f;
    public final bk8 g;

    public z0f0(l3f0 l3f0Var, boolean z, xi01 xi01Var, bk8 bk8Var) {
        this.d = l3f0Var;
        this.e = z;
        this.f = xi01Var;
        this.g = bk8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0f0)) {
            return false;
        }
        z0f0 z0f0Var = (z0f0) obj;
        return u890.j(this.d, z0f0Var.d) && this.e == z0f0Var.e && u890.j(this.f, z0f0Var.f) && this.g == z0f0Var.g;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.d.hashCode() * 31, 31, this.e);
        xi01 xi01Var = this.f;
        return this.g.hashCode() + ((iG + (xi01Var == null ? 0 : xi01Var.hashCode())) * 31);
    }
}
