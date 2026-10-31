package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f0e0 {
    public final String a;
    public final tle1 b;
    public final k0e0 c;
    public final wx60 d;
    public final wx60 e;
    public final g0e0 f;
    public final p0e0 g;

    public f0e0(String str, tle1 tle1Var, k0e0 k0e0Var, wx60 wx60Var, wx60 wx60Var2, g0e0 g0e0Var, p0e0 p0e0Var) {
        this.a = str;
        this.b = tle1Var;
        this.c = k0e0Var;
        this.d = wx60Var;
        this.e = wx60Var2;
        this.f = g0e0Var;
        this.g = p0e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0e0)) {
            return false;
        }
        f0e0 f0e0Var = (f0e0) obj;
        return u890.j(this.a, f0e0Var.a) && this.b.equals(f0e0Var.b) && this.c.equals(f0e0Var.c) && u890.j(this.d, f0e0Var.d) && u890.j(this.e, f0e0Var.e) && u890.j(this.f, f0e0Var.f) && u890.j(this.g, f0e0Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        wx60 wx60Var = this.d;
        int iHashCode2 = (iHashCode + (wx60Var == null ? 0 : wx60Var.hashCode())) * 31;
        wx60 wx60Var2 = this.e;
        int iHashCode3 = (iHashCode2 + (wx60Var2 == null ? 0 : wx60Var2.hashCode())) * 31;
        g0e0 g0e0Var = this.f;
        int iHashCode4 = (iHashCode3 + (g0e0Var == null ? 0 : g0e0Var.hashCode())) * 31;
        p0e0 p0e0Var = this.g;
        return iHashCode4 + (p0e0Var != null ? p0e0Var.hashCode() : 0);
    }
}
