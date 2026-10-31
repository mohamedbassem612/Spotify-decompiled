package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e381 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final d8r0 g;
    public final int h;
    public final Integer i;
    public final String j;
    public final boolean k;

    public e381(String str, String str2, String str3, String str4, String str5, String str6, d8r0 d8r0Var, int i, Integer num, String str7, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = d8r0Var;
        this.h = i;
        this.i = num;
        this.j = str7;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e381)) {
            return false;
        }
        e381 e381Var = (e381) obj;
        return u890.j(this.a, e381Var.a) && u890.j(this.b, e381Var.b) && u890.j(this.c, e381Var.c) && u890.j(this.d, e381Var.d) && u890.j(this.e, e381Var.e) && u890.j(this.f, e381Var.f) && this.g.equals(e381Var.g) && this.h == e381Var.h && u890.j(this.i, e381Var.i) && u890.j(this.j, e381Var.j) && this.k == e381Var.k;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.h, hrt.i(this.g, cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31);
        Integer num = this.i;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.j;
        return Boolean.hashCode(this.k) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
