package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q191 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k = "";

    public q191(String str, int i, int i2, int i3, long j, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q191)) {
            return false;
        }
        q191 q191Var = (q191) obj;
        return this.a.equals(q191Var.a) && this.b == q191Var.b && this.c == q191Var.c && this.d == q191Var.d && this.e == q191Var.e && this.f.equals(q191Var.f) && this.g.equals(q191Var.g) && this.h.equals(q191Var.h) && this.i.equals(q191Var.i) && this.j.equals(q191Var.j) && this.k.equals(q191Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.f(ab80.k(this.d, kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31), this.e, 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }
}
