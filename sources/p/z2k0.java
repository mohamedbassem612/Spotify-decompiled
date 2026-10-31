package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z2k0 implements k4k0 {
    public final String a;
    public final tv80 b;

    public z2k0(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2k0)) {
            return false;
        }
        z2k0 z2k0Var = (z2k0) obj;
        return u890.j(this.a, z2k0Var.a) && u890.j(this.b, z2k0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
