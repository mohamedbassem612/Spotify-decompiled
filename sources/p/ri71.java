package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ri71 {
    public final String a;
    public final String b;
    public final String c;
    public final hl71 d;
    public final te71 e;
    public final String f;

    public ri71(String str, String str2, String str3, hl71 hl71Var, te71 te71Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hl71Var;
        this.e = te71Var;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri71)) {
            return false;
        }
        ri71 ri71Var = (ri71) obj;
        return u890.j(this.a, ri71Var.a) && u890.j(this.b, ri71Var.b) && u890.j(this.c, ri71Var.c) && u890.j(this.d, ri71Var.d) && u890.j(this.e, ri71Var.e) && u890.j(this.f, ri71Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        String str = this.f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
