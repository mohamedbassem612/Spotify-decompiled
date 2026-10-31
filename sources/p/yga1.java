package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yga1 {
    public final eia1 a;
    public final bb20 b;
    public final bia1 c;

    public yga1(eia1 eia1Var, bb20 bb20Var, bia1 bia1Var) {
        this.a = eia1Var;
        this.b = bb20Var;
        this.c = bia1Var;
    }

    public static yga1 a(yga1 yga1Var, eia1 eia1Var, bb20 bb20Var, int i) {
        if ((i & 1) != 0) {
            eia1Var = yga1Var.a;
        }
        if ((i & 2) != 0) {
            bb20Var = yga1Var.b;
        }
        return new yga1(eia1Var, bb20Var, yga1Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yga1)) {
            return false;
        }
        yga1 yga1Var = (yga1) obj;
        return u890.j(this.a, yga1Var.a) && u890.j(this.b, yga1Var.b) && u890.j(this.c, yga1Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        bia1 bia1Var = this.c;
        return iHashCode + (bia1Var == null ? 0 : bia1Var.a.hashCode());
    }
}
