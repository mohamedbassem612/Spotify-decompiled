package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qu3 {
    public final String a;
    public final String b;
    public final hqq0 c;
    public final String d;
    public final String e;
    public final String f;

    public qu3(String str, String str2, hqq0 hqq0Var, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = hqq0Var;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu3)) {
            return false;
        }
        qu3 qu3Var = (qu3) obj;
        return this.a.equals(qu3Var.a) && this.b.equals(qu3Var.b) && this.c.equals(qu3Var.c) && this.d.equals(qu3Var.d) && this.e.equals(qu3Var.e) && u890.j(this.f, qu3Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }
}
