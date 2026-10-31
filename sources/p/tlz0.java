package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tlz0 {
    public final String a;
    public final String b;
    public final sgf1 c;
    public final bhf1 d;
    public final glc1 e;
    public final klc1 f;
    public final fid0 g;
    public final ag1 h;
    public final String i;
    public final ooc1 j;
    public final roc1 k;
    public final boolean l;

    public tlz0(String str, String str2, sgf1 sgf1Var, bhf1 bhf1Var, glc1 glc1Var, klc1 klc1Var, fid0 fid0Var, ag1 ag1Var, String str3, ooc1 ooc1Var, roc1 roc1Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = sgf1Var;
        this.d = bhf1Var;
        this.e = glc1Var;
        this.f = klc1Var;
        this.g = fid0Var;
        this.h = ag1Var;
        this.i = str3;
        this.j = ooc1Var;
        this.k = roc1Var;
        this.l = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlz0)) {
            return false;
        }
        tlz0 tlz0Var = (tlz0) obj;
        return u890.j(this.a, tlz0Var.a) && u890.j(this.b, tlz0Var.b) && u890.j(this.c, tlz0Var.c) && u890.j(this.d, tlz0Var.d) && u890.j(this.e, tlz0Var.e) && u890.j(this.f, tlz0Var.f) && u890.j(this.g, tlz0Var.g) && u890.j(this.h, tlz0Var.h) && u890.j(this.i, tlz0Var.i) && u890.j(this.j, tlz0Var.j) && u890.j(this.k, tlz0Var.k) && this.l == tlz0Var.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + ((this.k.hashCode() + ((this.j.hashCode() + cy30.d((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.i)) * 31)) * 31);
    }
}
