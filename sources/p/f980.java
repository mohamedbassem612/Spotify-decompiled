package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f980 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final lg60 g;

    public f980(String str, String str2, String str3, String str4, String str5, int i, lg60 lg60Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = lg60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f980) {
            f980 f980Var = (f980) obj;
            return u890.j(this.a, f980Var.a) && this.b.equals(f980Var.b) && this.c.equals(f980Var.c) && this.d.equals(f980Var.d) && this.e.equals(f980Var.e) && this.f == f980Var.f && this.g == f980Var.g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + ab80.k(this.f, cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }
}
