package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u191 {
    public final String a;
    public final int b;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String c = "";
    public final String j = "";

    public u191(String str, int i, long j, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = i;
        this.d = j;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u191)) {
            return false;
        }
        u191 u191Var = (u191) obj;
        return this.a.equals(u191Var.a) && this.b == u191Var.b && this.c.equals(u191Var.c) && this.d == u191Var.d && this.e.equals(u191Var.e) && this.f.equals(u191Var.f) && this.g.equals(u191Var.g) && this.h.equals(u191Var.h) && this.i.equals(u191Var.i) && this.j.equals(u191Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.f(cy30.d(cy30.f(kaa0.f(this.b, this.a.hashCode() * 31, 31), 0L, 31), 31, this.c), this.d, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
