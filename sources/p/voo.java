package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class voo implements woo {
    public final s69 a;
    public final s69 b;
    public final duk1 c;

    public voo(s69 s69Var, s69 s69Var2, duk1 duk1Var) {
        this.a = s69Var;
        this.b = s69Var2;
        this.c = duk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voo)) {
            return false;
        }
        voo vooVar = (voo) obj;
        return u890.j(this.a, vooVar.a) && u890.j(this.b, vooVar.b) && this.c == vooVar.c;
    }

    public final int hashCode() {
        s69 s69Var = this.a;
        int iHashCode = (s69Var == null ? 0 : s69Var.hashCode()) * 31;
        s69 s69Var2 = this.b;
        int iHashCode2 = (iHashCode + (s69Var2 == null ? 0 : s69Var2.hashCode())) * 31;
        duk1 duk1Var = this.c;
        return iHashCode2 + (duk1Var != null ? duk1Var.hashCode() : 0);
    }
}
