package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ky50 {
    public final ex50 a;
    public final bkj0 b;
    public final bkj0 c;
    public final bkj0 d;

    public ky50(ex50 ex50Var, bkj0 bkj0Var, bkj0 bkj0Var2, bkj0 bkj0Var3) {
        this.a = ex50Var;
        this.b = bkj0Var;
        this.c = bkj0Var2;
        this.d = bkj0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky50)) {
            return false;
        }
        ky50 ky50Var = (ky50) obj;
        return this.a.equals(ky50Var.a) && u890.j(this.b, ky50Var.b) && u890.j(this.c, ky50Var.c) && u890.j(this.d, ky50Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bkj0 bkj0Var = this.b;
        int iHashCode2 = (iHashCode + (bkj0Var == null ? 0 : bkj0Var.hashCode())) * 31;
        bkj0 bkj0Var2 = this.c;
        int iHashCode3 = (iHashCode2 + (bkj0Var2 == null ? 0 : bkj0Var2.hashCode())) * 31;
        bkj0 bkj0Var3 = this.d;
        return iHashCode3 + (bkj0Var3 != null ? bkj0Var3.hashCode() : 0);
    }
}
