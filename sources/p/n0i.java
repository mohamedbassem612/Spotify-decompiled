package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n0i {
    public final kxt0 a;
    public final n2u0 b;

    public n0i(kxt0 kxt0Var, n2u0 n2u0Var) {
        this.a = kxt0Var;
        this.b = n2u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0i)) {
            return false;
        }
        n0i n0iVar = (n0i) obj;
        return u890.j(this.a, n0iVar.a) && u890.j(this.b, n0iVar.b);
    }

    public final int hashCode() {
        kxt0 kxt0Var = this.a;
        int iHashCode = (kxt0Var == null ? 0 : kxt0Var.hashCode()) * 31;
        n2u0 n2u0Var = this.b;
        return iHashCode + (n2u0Var != null ? n2u0Var.hashCode() : 0);
    }
}
