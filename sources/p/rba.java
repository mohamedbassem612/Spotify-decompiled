package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rba {
    public final ujo0 a;
    public final ilo0 b;
    public final jlo0 c;
    public final klo0 d;
    public final hlo0 e;
    public final boolean f;

    public rba(ujo0 ujo0Var, ilo0 ilo0Var, jlo0 jlo0Var, klo0 klo0Var, hlo0 hlo0Var, boolean z) {
        this.a = ujo0Var;
        this.b = ilo0Var;
        this.c = jlo0Var;
        this.d = klo0Var;
        this.e = hlo0Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rba)) {
            return false;
        }
        rba rbaVar = (rba) obj;
        return this.a.equals(rbaVar.a) && this.b.equals(rbaVar.b) && u890.j(this.c, rbaVar.c) && u890.j(this.d, rbaVar.d) && u890.j(this.e, rbaVar.e) && this.f == rbaVar.f;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        jlo0 jlo0Var = this.c;
        int iHashCode2 = (iHashCode + (jlo0Var == null ? 0 : jlo0Var.c.hashCode())) * 31;
        klo0 klo0Var = this.d;
        int iHashCode3 = (iHashCode2 + (klo0Var == null ? 0 : klo0Var.hashCode())) * 31;
        hlo0 hlo0Var = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode3 + (hlo0Var != null ? hlo0Var.hashCode() : 0)) * 31);
    }
}
