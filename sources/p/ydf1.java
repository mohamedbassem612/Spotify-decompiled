package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ydf1 {
    public final jo70 a;
    public final xkk1 b;
    public final zoy0 c;

    public ydf1(jo70 jo70Var, xkk1 xkk1Var, zoy0 zoy0Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = zoy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydf1)) {
            return false;
        }
        ydf1 ydf1Var = (ydf1) obj;
        return u890.j(this.a, ydf1Var.a) && u890.j(this.b, ydf1Var.b) && u890.j(this.c, ydf1Var.c);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        zoy0 zoy0Var = this.c;
        return iHashCode2 + (zoy0Var != null ? zoy0Var.hashCode() : 0);
    }
}
