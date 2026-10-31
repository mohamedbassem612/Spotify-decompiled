package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pl71 {
    public final cmt a;
    public final String b;
    public final String c;
    public final String d;
    public final va71 e;
    public final hl71 f;
    public final te71 g;
    public final String h;

    public pl71(String str, String str2, String str3, String str4, cmt cmtVar, va71 va71Var, te71 te71Var, hl71 hl71Var) {
        this.a = cmtVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = va71Var;
        this.f = hl71Var;
        this.g = te71Var;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl71)) {
            return false;
        }
        pl71 pl71Var = (pl71) obj;
        return u890.j(this.a, pl71Var.a) && u890.j(this.b, pl71Var.b) && u890.j(this.c, pl71Var.c) && u890.j(this.d, pl71Var.d) && u890.j(this.e, pl71Var.e) && u890.j(this.f, pl71Var.f) && u890.j(this.g, pl71Var.g) && u890.j(this.h, pl71Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.a.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31;
        String str = this.h;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
