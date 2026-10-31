package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l761 {
    public final jo70 a;
    public final xkk1 b;
    public final zc8 c;

    public l761(zc8 zc8Var, jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = zc8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l761)) {
            return false;
        }
        l761 l761Var = (l761) obj;
        return this.a.equals(l761Var.a) && u890.j(this.b, l761Var.b) && u890.j(this.c, l761Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        zc8 zc8Var = this.c;
        return iHashCode2 + (zc8Var != null ? zc8Var.hashCode() : 0);
    }
}
