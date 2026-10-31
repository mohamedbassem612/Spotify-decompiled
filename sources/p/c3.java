package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final hy50 g;
    public final String h;

    public c3(String str, String str2, String str3, String str4, String str5, String str6, hy50 hy50Var, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = hy50Var;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return this.a.equals(c3Var.a) && u890.j(this.b, c3Var.b) && u890.j(this.c, c3Var.c) && this.d.equals(c3Var.d) && this.e.equals(c3Var.e) && u890.j(this.f, c3Var.f) && this.g.equals(c3Var.g) && this.h.equals(c3Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
