package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class htc1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final heb1 h;

    public htc1(String str, String str2, String str3, String str4, String str5, int i, int i2, heb1 heb1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = heb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof htc1) {
            htc1 htc1Var = (htc1) obj;
            return u890.j(this.a, htc1Var.a) && this.b.equals(htc1Var.b) && this.c.equals(htc1Var.c) && this.d.equals(htc1Var.d) && this.e.equals(htc1Var.e) && this.f == htc1Var.f && this.g == htc1Var.g && this.h == htc1Var.h;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + ab80.k(this.g, ab80.k(this.f, cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31);
    }
}
