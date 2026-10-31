package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l3c0 extends rqo1 {
    public final ou80 c;
    public final y6r0 d;

    public l3c0(ou80 ou80Var, y6r0 y6r0Var) {
        this.c = ou80Var;
        this.d = y6r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3c0)) {
            return false;
        }
        l3c0 l3c0Var = (l3c0) obj;
        return u890.j(this.c, l3c0Var.c) && u890.j(this.d, l3c0Var.d);
    }

    public final int hashCode() {
        ou80 ou80Var = this.c;
        int iHashCode = (ou80Var == null ? 0 : ou80Var.a.hashCode()) * 31;
        y6r0 y6r0Var = this.d;
        return iHashCode + (y6r0Var != null ? y6r0Var.a.hashCode() : 0);
    }
}
