package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zxr0 {
    public final jo70 a;
    public final xkk1 b;
    public final hll c;
    public final qfd d;
    public final boolean e;
    public final boolean f;

    public zxr0(jo70 jo70Var, xkk1 xkk1Var, hll hllVar, qfd qfdVar, boolean z, boolean z2) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = hllVar;
        this.d = qfdVar;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxr0)) {
            return false;
        }
        zxr0 zxr0Var = (zxr0) obj;
        return this.a.equals(zxr0Var.a) && u890.j(this.b, zxr0Var.b) && u890.j(this.c, zxr0Var.c) && u890.j(this.d, zxr0Var.d) && this.e == zxr0Var.e && this.f == zxr0Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        hll hllVar = this.c;
        int iHashCode3 = (iHashCode2 + (hllVar == null ? 0 : hllVar.hashCode())) * 31;
        qfd qfdVar = this.d;
        return Boolean.hashCode(this.f) + xcg1.g((iHashCode3 + (qfdVar != null ? qfdVar.hashCode() : 0)) * 31, 31, this.e);
    }
}
