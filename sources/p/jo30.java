package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jo30 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final say g;

    public jo30(String str, String str2, String str3, String str4, String str5, boolean z, say sayVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = sayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jo30) {
            jo30 jo30Var = (jo30) obj;
            return u890.j(this.a, jo30Var.a) && this.b.equals(jo30Var.b) && this.c.equals(jo30Var.c) && this.d.equals(jo30Var.d) && this.e.equals(jo30Var.e) && this.f == jo30Var.f && this.g == jo30Var.g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
