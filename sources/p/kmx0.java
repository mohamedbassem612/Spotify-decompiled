package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kmx0 {
    public final String a;
    public final d761 b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    public kmx0(String str, d761 d761Var, String str2, String str3, String str4, int i) {
        this.a = str;
        this.b = d761Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmx0)) {
            return false;
        }
        kmx0 kmx0Var = (kmx0) obj;
        return this.a.equals(kmx0Var.a) && this.b.equals(kmx0Var.b) && this.c.equals(kmx0Var.c) && this.d.equals(kmx0Var.d) && u890.j(this.e, kmx0Var.e) && this.f == kmx0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + cy30.d(cy30.d(cy30.d(ktd.f(this.a.hashCode() * 31, this.b.a, 31), 31, this.c), 31, this.d), 31, this.e);
    }
}
