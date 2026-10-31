package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ei71 {
    public final hl71 a;
    public final cmt b;
    public final String c;
    public final String d;
    public final String e;
    public final va71 f;
    public final te71 g;
    public final String h;

    public ei71(String str, String str2, String str3, String str4, cmt cmtVar, va71 va71Var, te71 te71Var, hl71 hl71Var) {
        this.a = hl71Var;
        this.b = cmtVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = va71Var;
        this.g = te71Var;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei71)) {
            return false;
        }
        ei71 ei71Var = (ei71) obj;
        return u890.j(this.a, ei71Var.a) && u890.j(this.b, ei71Var.b) && u890.j(this.c, ei71Var.c) && u890.j(this.d, ei71Var.d) && u890.j(this.e, ei71Var.e) && u890.j(this.f, ei71Var.f) && u890.j(this.g, ei71Var.g) && u890.j(this.h, ei71Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.a.hashCode() + cy30.d(cy30.d(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31;
        String str = this.h;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
