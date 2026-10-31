package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hy90 {
    public final vo90 a;
    public final gbl b;
    public final jeh0 c;
    public final int d;

    public hy90(vo90 vo90Var, gbl gblVar, jeh0 jeh0Var, int i) {
        this.a = vo90Var;
        this.b = gblVar;
        this.c = jeh0Var;
        this.d = i;
    }

    public static hy90 a(hy90 hy90Var, vo90 vo90Var, gbl gblVar, jeh0 jeh0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            vo90Var = hy90Var.a;
        }
        if ((i2 & 2) != 0) {
            gblVar = hy90Var.b;
        }
        if ((i2 & 4) != 0) {
            jeh0Var = hy90Var.c;
        }
        if ((i2 & 8) != 0) {
            i = hy90Var.d;
        }
        hy90Var.getClass();
        return new hy90(vo90Var, gblVar, jeh0Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy90)) {
            return false;
        }
        hy90 hy90Var = (hy90) obj;
        return u890.j(this.a, hy90Var.a) && this.b == hy90Var.b && u890.j(this.c, hy90Var.c) && this.d == hy90Var.d;
    }

    public final int hashCode() {
        vo90 vo90Var = this.a;
        int iHashCode = (this.b.hashCode() + ((vo90Var == null ? 0 : vo90Var.hashCode()) * 31)) * 31;
        jeh0 jeh0Var = this.c;
        int iHashCode2 = (iHashCode + (jeh0Var == null ? 0 : jeh0Var.a.hashCode())) * 31;
        int i = this.d;
        return iHashCode2 + (i != 0 ? l1d.C(i) : 0);
    }
}
