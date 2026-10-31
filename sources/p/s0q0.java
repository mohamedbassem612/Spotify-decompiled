package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s0q0 {
    public final y4m a;
    public final r840 b;
    public final ast0 c;
    public final String d;
    public final i0q0 e;
    public final boolean f;
    public final boolean g;

    public s0q0(y4m y4mVar, r840 r840Var, ast0 ast0Var, String str, i0q0 i0q0Var, boolean z, boolean z2) {
        this.a = y4mVar;
        this.b = r840Var;
        this.c = ast0Var;
        this.d = str;
        this.e = i0q0Var;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0q0)) {
            return false;
        }
        s0q0 s0q0Var = (s0q0) obj;
        return this.a.equals(s0q0Var.a) && this.b.equals(s0q0Var.b) && this.c == s0q0Var.c && u890.j(this.d, s0q0Var.d) && this.e.equals(s0q0Var.e) && this.f == s0q0Var.f && this.g == s0q0Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return Boolean.hashCode(this.g) + xcg1.g((this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f);
    }
}
