package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r810 {
    public final jo70 a;
    public final xkk1 b;
    public final zoy0 c;
    public final hll d;
    public final a7q0 e;
    public final e2k1 f;
    public final v6v0 g;
    public final zc8 h;
    public final z070 i;

    public r810(jo70 jo70Var, xkk1 xkk1Var, zoy0 zoy0Var, hll hllVar, a7q0 a7q0Var, e2k1 e2k1Var, v6v0 v6v0Var, zc8 zc8Var, z070 z070Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = zoy0Var;
        this.d = hllVar;
        this.e = a7q0Var;
        this.f = e2k1Var;
        this.g = v6v0Var;
        this.h = zc8Var;
        this.i = z070Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r810)) {
            return false;
        }
        r810 r810Var = (r810) obj;
        return this.a.equals(r810Var.a) && u890.j(this.b, r810Var.b) && u890.j(this.c, r810Var.c) && u890.j(this.d, r810Var.d) && u890.j(this.e, r810Var.e) && u890.j(this.f, r810Var.f) && u890.j(this.g, r810Var.g) && u890.j(this.h, r810Var.h) && u890.j(this.i, r810Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        zoy0 zoy0Var = this.c;
        int iHashCode3 = (iHashCode2 + (zoy0Var == null ? 0 : zoy0Var.hashCode())) * 31;
        hll hllVar = this.d;
        int iHashCode4 = (iHashCode3 + (hllVar == null ? 0 : hllVar.hashCode())) * 31;
        a7q0 a7q0Var = this.e;
        int iHashCode5 = (iHashCode4 + (a7q0Var == null ? 0 : a7q0Var.hashCode())) * 31;
        e2k1 e2k1Var = this.f;
        int iHashCode6 = (iHashCode5 + (e2k1Var == null ? 0 : Long.hashCode(e2k1Var.a))) * 31;
        v6v0 v6v0Var = this.g;
        int iHashCode7 = (iHashCode6 + (v6v0Var == null ? 0 : v6v0Var.hashCode())) * 31;
        zc8 zc8Var = this.h;
        int iHashCode8 = (iHashCode7 + (zc8Var == null ? 0 : zc8Var.hashCode())) * 31;
        z070 z070Var = this.i;
        return iHashCode8 + (z070Var != null ? z070Var.a.hashCode() : 0);
    }
}
