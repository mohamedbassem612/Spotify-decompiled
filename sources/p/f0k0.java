package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f0k0 implements k1k0 {
    public final lhg1 a;
    public final tv80 b;

    public f0k0(lhg1 lhg1Var, tv80 tv80Var) {
        this.a = lhg1Var;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0k0)) {
            return false;
        }
        f0k0 f0k0Var = (f0k0) obj;
        return u890.j(this.a, f0k0Var.a) && u890.j(this.b, f0k0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }

    public final String toString() {
        return f4i1.f("AddToPlaylist(transition=", this.a.b(), ")");
    }
}
