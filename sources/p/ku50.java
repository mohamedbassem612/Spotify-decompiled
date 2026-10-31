package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ku50 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final c380 f;

    public ku50(String str, String str2, String str3, String str4, String str5, c380 c380Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku50)) {
            return false;
        }
        ku50 ku50Var = (ku50) obj;
        return this.a.equals(ku50Var.a) && this.b.equals(ku50Var.b) && this.c.equals(ku50Var.c) && this.d.equals(ku50Var.d) && this.e.equals(ku50Var.e) && u890.j(this.f, ku50Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
