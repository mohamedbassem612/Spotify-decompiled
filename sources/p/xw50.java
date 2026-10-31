package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xw50 {
    public final bkj0 a;
    public final bkj0 b;
    public final bkj0 c;
    public final bkj0 d;

    public xw50(bkj0 bkj0Var, bkj0 bkj0Var2, bkj0 bkj0Var3, bkj0 bkj0Var4, int i) {
        bkj0Var4 = (i & 8) != 0 ? null : bkj0Var4;
        this.a = bkj0Var;
        this.b = bkj0Var2;
        this.c = bkj0Var3;
        this.d = bkj0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xw50) {
            xw50 xw50Var = (xw50) obj;
            if (this.a == xw50Var.a && this.b == xw50Var.b && u890.j(this.c, xw50Var.c) && u890.j(this.d, xw50Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        bkj0 bkj0Var = this.c;
        int iHashCode2 = (iHashCode + (bkj0Var == null ? 0 : bkj0Var.hashCode())) * 31;
        bkj0 bkj0Var2 = this.d;
        return (iHashCode2 + (bkj0Var2 != null ? bkj0Var2.hashCode() : 0)) * 31;
    }
}
