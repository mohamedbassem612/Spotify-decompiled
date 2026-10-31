package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wmj0 extends ymj0 {
    public final aw21 a;
    public final vn71 b;
    public final xv91 c;

    public wmj0(aw21 aw21Var, vn71 vn71Var, xv91 xv91Var) {
        this.a = aw21Var;
        this.b = vn71Var;
        this.c = xv91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmj0)) {
            return false;
        }
        wmj0 wmj0Var = (wmj0) obj;
        return u890.j(this.a, wmj0Var.a) && u890.j(this.b, wmj0Var.b) && u890.j(this.c, wmj0Var.c);
    }

    public final int hashCode() {
        aw21 aw21Var = this.a;
        int iHashCode = (aw21Var == null ? 0 : aw21Var.a.hashCode()) * 31;
        vn71 vn71Var = this.b;
        int iHashCode2 = (iHashCode + (vn71Var == null ? 0 : vn71Var.a.hashCode())) * 31;
        xv91 xv91Var = this.c;
        return iHashCode2 + (xv91Var != null ? xv91Var.a.hashCode() : 0);
    }
}
