package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class azc1 {
    public final String a;
    public final jxc1 b;
    public final int c;
    public final String d;
    public final yyc1 e;
    public final zyc1 f;
    public final xyc1 g;

    public azc1(String str, jxc1 jxc1Var, int i, String str2, yyc1 yyc1Var, zyc1 zyc1Var, xyc1 xyc1Var) {
        this.a = str;
        this.b = jxc1Var;
        this.c = i;
        this.d = str2;
        this.e = yyc1Var;
        this.f = zyc1Var;
        this.g = xyc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azc1)) {
            return false;
        }
        azc1 azc1Var = (azc1) obj;
        return u890.j(this.a, azc1Var.a) && u890.j(this.b, azc1Var.b) && this.c == azc1Var.c && u890.j(this.d, azc1Var.d) && this.e.equals(azc1Var.e) && this.f.equals(azc1Var.f) && this.g.equals(azc1Var.g);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }
}
