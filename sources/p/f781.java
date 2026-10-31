package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f781 {
    public final q781 a;
    public final v1v b;
    public final vum1 c;
    public final kk3 d;
    public final boolean e;
    public final c221 f;
    public final g781 g;
    public final spq0 h;
    public final boolean i;

    public f781(q781 q781Var, v1v v1vVar, vum1 vum1Var, kk3 kk3Var, boolean z, c221 c221Var, g781 g781Var, spq0 spq0Var, boolean z2) {
        this.a = q781Var;
        this.b = v1vVar;
        this.c = vum1Var;
        this.d = kk3Var;
        this.e = z;
        this.f = c221Var;
        this.g = g781Var;
        this.h = spq0Var;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f781)) {
            return false;
        }
        f781 f781Var = (f781) obj;
        return this.a.equals(f781Var.a) && this.b.equals(f781Var.b) && this.c.equals(f781Var.c) && this.d.equals(f781Var.d) && this.e == f781Var.e && this.f.equals(f781Var.f) && this.g.equals(f781Var.g) && this.h.equals(f781Var.h) && this.i == f781Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + xcg1.g((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e)) * 31)) * 31)) * 31);
    }
}
