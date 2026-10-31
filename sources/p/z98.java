package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z98 {
    public final String a;
    public final jo70 b;
    public final zoy0 c;
    public final xkk1 d;
    public final xlw0 e;
    public final hll f;

    public z98(String str, jo70 jo70Var, zoy0 zoy0Var, xkk1 xkk1Var, xlw0 xlw0Var, hll hllVar) {
        this.a = str;
        this.b = jo70Var;
        this.c = zoy0Var;
        this.d = xkk1Var;
        this.e = xlw0Var;
        this.f = hllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z98)) {
            return false;
        }
        z98 z98Var = (z98) obj;
        return u890.j(this.a, z98Var.a) && u890.j(this.b, z98Var.b) && u890.j(this.c, z98Var.c) && u890.j(this.d, z98Var.d) && u890.j(this.e, z98Var.e) && u890.j(this.f, z98Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        xkk1 xkk1Var = this.d;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        xlw0 xlw0Var = this.e;
        int iHashCode3 = (iHashCode2 + (xlw0Var == null ? 0 : xlw0Var.a.hashCode())) * 31;
        hll hllVar = this.f;
        return iHashCode3 + (hllVar != null ? hllVar.hashCode() : 0);
    }
}
