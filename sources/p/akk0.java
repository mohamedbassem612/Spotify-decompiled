package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class akk0 implements ikk0 {
    public final ox30 a;
    public final ox30 b;
    public final int c;
    public final rx30 d;

    public akk0(ox30 ox30Var, ox30 ox30Var2, int i, rx30 rx30Var) {
        this.a = ox30Var;
        this.b = ox30Var2;
        this.c = i;
        this.d = rx30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akk0)) {
            return false;
        }
        akk0 akk0Var = (akk0) obj;
        return u890.j(this.a, akk0Var.a) && u890.j(this.b, akk0Var.b) && this.c == akk0Var.c && this.d == akk0Var.d;
    }

    public final int hashCode() {
        ox30 ox30Var = this.a;
        int iHashCode = (ox30Var == null ? 0 : ox30Var.hashCode()) * 31;
        ox30 ox30Var2 = this.b;
        int iF = kaa0.f(this.c, (iHashCode + (ox30Var2 == null ? 0 : ox30Var2.hashCode())) * 31, 31);
        rx30 rx30Var = this.d;
        return iF + (rx30Var != null ? rx30Var.hashCode() : 0);
    }
}
