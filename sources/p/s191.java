package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s191 {
    public final String a;
    public final int b;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String c = "";
    public final String i = "";

    public s191(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.a = str;
        this.b = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s191)) {
            return false;
        }
        s191 s191Var = (s191) obj;
        return this.a.equals(s191Var.a) && this.b == s191Var.b && this.c.equals(s191Var.c) && this.d.equals(s191Var.d) && this.e.equals(s191Var.e) && this.f.equals(s191Var.f) && this.g.equals(s191Var.g) && this.h.equals(s191Var.h) && this.i.equals(s191Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.f(kaa0.f(this.b, this.a.hashCode() * 31, 31), 0L, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
