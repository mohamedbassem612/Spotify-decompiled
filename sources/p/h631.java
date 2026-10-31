package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h631 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final f531 e;
    public final q431 f;
    public final c631 g;

    public h631(String str, String str2, String str3, String str4, f531 f531Var, q431 q431Var, c631 c631Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = f531Var;
        this.f = q431Var;
        this.g = c631Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h631)) {
            return false;
        }
        h631 h631Var = (h631) obj;
        return u890.j(this.a, h631Var.a) && this.b.equals(h631Var.b) && this.c.equals(h631Var.c) && this.d.equals(h631Var.d) && this.e.equals(h631Var.e) && this.f.equals(h631Var.f) && this.g.equals(h631Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + cy30.d(cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31);
    }
}
