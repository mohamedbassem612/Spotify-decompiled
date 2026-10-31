package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wyh1 extends ila0 {
    public final String i;
    public final String j;
    public final azh1 k;
    public final vyh1 l;
    public final vyh1 m;
    public final zyh1 n;

    public wyh1(String str, String str2, azh1 azh1Var, vyh1 vyh1Var, vyh1 vyh1Var2, zyh1 zyh1Var) {
        this.i = str;
        this.j = str2;
        this.k = azh1Var;
        this.l = vyh1Var;
        this.m = vyh1Var2;
        this.n = zyh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyh1)) {
            return false;
        }
        wyh1 wyh1Var = (wyh1) obj;
        return this.i.equals(wyh1Var.i) && this.j.equals(wyh1Var.j) && u890.j(this.k, wyh1Var.k) && this.l.equals(wyh1Var.l) && u890.j(this.m, wyh1Var.m) && u890.j(this.n, wyh1Var.n);
    }

    public final int hashCode() {
        int iD = cy30.d(this.i.hashCode() * 31, 31, this.j);
        azh1 azh1Var = this.k;
        int iHashCode = (this.l.hashCode() + ((iD + (azh1Var == null ? 0 : azh1Var.hashCode())) * 31)) * 31;
        vyh1 vyh1Var = this.m;
        int iHashCode2 = (iHashCode + (vyh1Var == null ? 0 : vyh1Var.hashCode())) * 31;
        zyh1 zyh1Var = this.n;
        return iHashCode2 + (zyh1Var != null ? zyh1Var.hashCode() : 0);
    }
}
