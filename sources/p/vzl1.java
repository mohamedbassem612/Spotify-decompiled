package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vzl1 implements g0m1 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final veo k;

    public vzl1(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, String str8, veo veoVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = veoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzl1)) {
            return false;
        }
        vzl1 vzl1Var = (vzl1) obj;
        return this.a == vzl1Var.a && this.b.equals(vzl1Var.b) && this.c.equals(vzl1Var.c) && this.d.equals(vzl1Var.d) && u890.j(this.e, vzl1Var.e) && this.f == vzl1Var.f && this.g.equals(vzl1Var.g) && this.h.equals(vzl1Var.h) && this.i.equals(vzl1Var.i) && u890.j(this.j, vzl1Var.j) && this.k.equals(vzl1Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(kaa0.f(this.f, cy30.d(cy30.d(cy30.d(cy30.d(l1d.C(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }
}
