package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uoo implements woo {
    public final ox30 a;
    public final ox30 b;
    public final rx30 c;

    public uoo(ox30 ox30Var, ox30 ox30Var2, rx30 rx30Var) {
        this.a = ox30Var;
        this.b = ox30Var2;
        this.c = rx30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uoo)) {
            return false;
        }
        uoo uooVar = (uoo) obj;
        return u890.j(this.a, uooVar.a) && u890.j(this.b, uooVar.b) && this.c == uooVar.c;
    }

    public final int hashCode() {
        ox30 ox30Var = this.a;
        int iHashCode = (ox30Var == null ? 0 : ox30Var.hashCode()) * 31;
        ox30 ox30Var2 = this.b;
        int iHashCode2 = (iHashCode + (ox30Var2 == null ? 0 : ox30Var2.hashCode())) * 31;
        rx30 rx30Var = this.c;
        return iHashCode2 + (rx30Var != null ? rx30Var.hashCode() : 0);
    }
}
