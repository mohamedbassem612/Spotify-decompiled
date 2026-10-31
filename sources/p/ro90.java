package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ro90 {
    public final vo90 a;
    public final wo90 b;
    public final zo90 c;

    public ro90(vo90 vo90Var, wo90 wo90Var, zo90 zo90Var) {
        this.a = vo90Var;
        this.b = wo90Var;
        this.c = zo90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro90)) {
            return false;
        }
        ro90 ro90Var = (ro90) obj;
        return u890.j(this.a, ro90Var.a) && u890.j(this.b, ro90Var.b) && u890.j(this.c, ro90Var.c);
    }

    public final int hashCode() {
        vo90 vo90Var = this.a;
        int iHashCode = (vo90Var == null ? 0 : vo90Var.hashCode()) * 31;
        wo90 wo90Var = this.b;
        int iHashCode2 = (iHashCode + (wo90Var == null ? 0 : wo90Var.hashCode())) * 31;
        zo90 zo90Var = this.c;
        return iHashCode2 + (zo90Var != null ? zo90Var.hashCode() : 0);
    }
}
