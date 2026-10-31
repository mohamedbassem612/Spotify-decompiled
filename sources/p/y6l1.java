package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y6l1 extends sqe {
    public final String d;
    public final String e;
    public final String f;
    public final e7l1 g;
    public final x6l1 h;
    public final String i;
    public final String j;
    public final w6l1 k;

    public y6l1(String str, String str2, String str3, e7l1 e7l1Var, x6l1 x6l1Var, String str4, String str5, w6l1 w6l1Var) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = e7l1Var;
        this.h = x6l1Var;
        this.i = str4;
        this.j = str5;
        this.k = w6l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6l1)) {
            return false;
        }
        y6l1 y6l1Var = (y6l1) obj;
        return u890.j(this.d, y6l1Var.d) && u890.j(this.e, y6l1Var.e) && u890.j(this.f, y6l1Var.f) && u890.j(this.g, y6l1Var.g) && u890.j(this.h, y6l1Var.h) && u890.j(this.i, y6l1Var.i) && u890.j(this.j, y6l1Var.j) && u890.j(this.k, y6l1Var.k);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d((this.h.hashCode() + ((this.g.hashCode() + cy30.d(cy30.d(this.d.hashCode() * 31, 31, this.e), 31, this.f)) * 31)) * 31, 31, this.i), 31, this.j);
        w6l1 w6l1Var = this.k;
        return iD + (w6l1Var == null ? 0 : w6l1Var.hashCode());
    }

    public /* synthetic */ y6l1(e7l1 e7l1Var, x6l1 x6l1Var) {
        this("", "", "", e7l1Var, x6l1Var, "", "", null);
    }
}
