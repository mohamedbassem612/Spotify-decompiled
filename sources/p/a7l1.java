package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a7l1 extends sqe {
    public final String d;
    public final e7l1 e;
    public final x6l1 f;
    public final String g;
    public final String h;
    public final String i;
    public final w6l1 j;

    public a7l1(String str, e7l1 e7l1Var, x6l1 x6l1Var, String str2, String str3, String str4, w6l1 w6l1Var) {
        this.d = str;
        this.e = e7l1Var;
        this.f = x6l1Var;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = w6l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7l1)) {
            return false;
        }
        a7l1 a7l1Var = (a7l1) obj;
        return this.d.equals(a7l1Var.d) && this.e.equals(a7l1Var.e) && this.f.equals(a7l1Var.f) && this.g.equals(a7l1Var.g) && this.h.equals(a7l1Var.h) && this.i.equals(a7l1Var.i) && u890.j(this.j, a7l1Var.j);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i);
        w6l1 w6l1Var = this.j;
        return iD + (w6l1Var == null ? 0 : w6l1Var.hashCode());
    }
}
