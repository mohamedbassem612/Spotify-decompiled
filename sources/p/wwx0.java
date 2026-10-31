package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wwx0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final t120 e;
    public final String f;
    public final String g;

    public wwx0(String str, String str2, String str3, String str4, t120 t120Var, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = t120Var;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwx0)) {
            return false;
        }
        wwx0 wwx0Var = (wwx0) obj;
        return this.a.equals(wwx0Var.a) && this.b.equals(wwx0Var.b) && this.c.equals(wwx0Var.c) && u890.j(this.d, wwx0Var.d) && u890.j(this.e, wwx0Var.e) && this.f.equals(wwx0Var.f) && this.g.equals(wwx0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        t120 t120Var = this.e;
        return this.g.hashCode() + cy30.d((iHashCode + (t120Var != null ? t120Var.hashCode() : 0)) * 31, 31, this.f);
    }
}
