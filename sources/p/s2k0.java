package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s2k0 implements k4k0 {
    public final String a;
    public final tv80 b;

    public s2k0(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2k0)) {
            return false;
        }
        s2k0 s2k0Var = (s2k0) obj;
        return u890.j(this.a, s2k0Var.a) && u890.j(this.b, s2k0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
