package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z8e0 {
    public final a7q0 a;
    public final hll b;
    public final e2k1 c;
    public final zoy0 d;
    public final iix0 e;
    public final uld f;
    public final boolean g;

    public z8e0(a7q0 a7q0Var, hll hllVar, e2k1 e2k1Var, zoy0 zoy0Var, iix0 iix0Var, uld uldVar, boolean z) {
        this.a = a7q0Var;
        this.b = hllVar;
        this.c = e2k1Var;
        this.d = zoy0Var;
        this.e = iix0Var;
        this.f = uldVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8e0)) {
            return false;
        }
        z8e0 z8e0Var = (z8e0) obj;
        return u890.j(this.a, z8e0Var.a) && u890.j(this.b, z8e0Var.b) && u890.j(this.c, z8e0Var.c) && u890.j(this.d, z8e0Var.d) && u890.j(this.e, z8e0Var.e) && u890.j(this.f, z8e0Var.f) && this.g == z8e0Var.g;
    }

    public final int hashCode() {
        a7q0 a7q0Var = this.a;
        int iHashCode = (a7q0Var == null ? 0 : a7q0Var.hashCode()) * 31;
        hll hllVar = this.b;
        int iHashCode2 = (iHashCode + (hllVar == null ? 0 : hllVar.hashCode())) * 31;
        e2k1 e2k1Var = this.c;
        int iHashCode3 = (iHashCode2 + (e2k1Var == null ? 0 : Long.hashCode(e2k1Var.a))) * 31;
        zoy0 zoy0Var = this.d;
        int iHashCode4 = (iHashCode3 + (zoy0Var == null ? 0 : zoy0Var.hashCode())) * 31;
        iix0 iix0Var = this.e;
        int iHashCode5 = (iHashCode4 + (iix0Var == null ? 0 : iix0Var.hashCode())) * 31;
        uld uldVar = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode5 + (uldVar != null ? uldVar.hashCode() : 0)) * 31);
    }
}
