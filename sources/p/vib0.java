package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vib0 {
    public final jo70 a;
    public final xkk1 b;
    public final pjw0 c;
    public final ro7 d;
    public final ro7 e;
    public final vnb1 f;

    public vib0(jo70 jo70Var, xkk1 xkk1Var, pjw0 pjw0Var, ro7 ro7Var, ro7 ro7Var2, vnb1 vnb1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = pjw0Var;
        this.d = ro7Var;
        this.e = ro7Var2;
        this.f = vnb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vib0)) {
            return false;
        }
        vib0 vib0Var = (vib0) obj;
        return this.a.equals(vib0Var.a) && this.b.equals(vib0Var.b) && u890.j(this.c, vib0Var.c) && u890.j(this.d, vib0Var.d) && u890.j(this.e, vib0Var.e) && this.f.equals(vib0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        pjw0 pjw0Var = this.c;
        int iHashCode2 = (iHashCode + (pjw0Var == null ? 0 : pjw0Var.hashCode())) * 31;
        ro7 ro7Var = this.d;
        int iHashCode3 = (iHashCode2 + (ro7Var == null ? 0 : ro7Var.hashCode())) * 31;
        ro7 ro7Var2 = this.e;
        return this.f.hashCode() + ((iHashCode3 + (ro7Var2 != null ? ro7Var2.hashCode() : 0)) * 31);
    }
}
