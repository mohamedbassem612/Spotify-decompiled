package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yyh1 extends ila0 {
    public final String i;
    public final String j;
    public final azh1 k;
    public final String l;

    public yyh1(String str, String str2, azh1 azh1Var, String str3) {
        this.i = str;
        this.j = str2;
        this.k = azh1Var;
        this.l = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyh1)) {
            return false;
        }
        yyh1 yyh1Var = (yyh1) obj;
        return this.i.equals(yyh1Var.i) && this.j.equals(yyh1Var.j) && u890.j(this.k, yyh1Var.k) && this.l.equals(yyh1Var.l);
    }

    public final int hashCode() {
        int iD = cy30.d(this.i.hashCode() * 31, 31, this.j);
        azh1 azh1Var = this.k;
        return this.l.hashCode() + ((iD + (azh1Var == null ? 0 : azh1Var.hashCode())) * 31);
    }
}
