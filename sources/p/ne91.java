package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ne91 {
    public final xpw a;
    public final vu30 b;
    public final xu30 c;

    public ne91(xpw xpwVar, vu30 vu30Var, xu30 xu30Var) {
        this.a = xpwVar;
        this.b = vu30Var;
        this.c = xu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne91)) {
            return false;
        }
        ne91 ne91Var = (ne91) obj;
        return this.a.equals(ne91Var.a) && u890.j(this.b, ne91Var.b) && u890.j(this.c, ne91Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vu30 vu30Var = this.b;
        int iHashCode2 = (iHashCode + (vu30Var == null ? 0 : vu30Var.hashCode())) * 31;
        xu30 xu30Var = this.c;
        return iHashCode2 + (xu30Var != null ? xu30Var.hashCode() : 0);
    }
}
