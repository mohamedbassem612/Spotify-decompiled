package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r571 {
    public final p371 a;
    public final yn71 b;
    public final String c;
    public final String d;
    public final String e;
    public final z771 f;
    public final String g;
    public final z771 h;

    public r571(String str, String str2, String str3, String str4, p371 p371Var, z771 z771Var, z771 z771Var2, yn71 yn71Var) {
        this.a = p371Var;
        this.b = yn71Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z771Var;
        this.g = str4;
        this.h = z771Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r571)) {
            return false;
        }
        r571 r571Var = (r571) obj;
        return u890.j(this.a, r571Var.a) && u890.j(this.b, r571Var.b) && u890.j(this.c, r571Var.c) && u890.j(this.d, r571Var.d) && u890.j(this.e, r571Var.e) && u890.j(this.f, r571Var.f) && u890.j(this.g, r571Var.g) && u890.j(this.h, r571Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        z771 z771Var = this.f;
        int iHashCode = (iD + (z771Var == null ? 0 : z771Var.a.hashCode())) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        z771 z771Var2 = this.h;
        return iHashCode2 + (z771Var2 != null ? z771Var2.a.hashCode() : 0);
    }
}
