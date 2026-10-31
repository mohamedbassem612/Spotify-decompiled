package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yy71 {
    public final jo70 a;
    public final xkk1 b;
    public final jv01 c;
    public final jw01 d;
    public final gv01 e;
    public final Boolean f;

    public yy71(jo70 jo70Var, xkk1 xkk1Var, jv01 jv01Var, jw01 jw01Var, gv01 gv01Var, Boolean bool) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = jv01Var;
        this.d = jw01Var;
        this.e = gv01Var;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy71)) {
            return false;
        }
        yy71 yy71Var = (yy71) obj;
        return u890.j(this.a, yy71Var.a) && u890.j(this.b, yy71Var.b) && u890.j(this.c, yy71Var.c) && u890.j(this.d, yy71Var.d) && u890.j(this.e, yy71Var.e) && u890.j(this.f, yy71Var.f);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        jv01 jv01Var = this.c;
        int iHashCode3 = (iHashCode2 + (jv01Var == null ? 0 : jv01Var.hashCode())) * 31;
        jw01 jw01Var = this.d;
        int iHashCode4 = (iHashCode3 + (jw01Var == null ? 0 : jw01Var.hashCode())) * 31;
        gv01 gv01Var = this.e;
        int iHashCode5 = (iHashCode4 + (gv01Var == null ? 0 : gv01Var.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }
}
