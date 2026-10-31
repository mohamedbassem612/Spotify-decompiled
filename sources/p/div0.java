package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class div0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final civ0 f;
    public final civ0 g;
    public final long h;
    public final String i;
    public final boolean j;
    public final yhv0 k;

    public div0(String str, String str2, String str3, String str4, boolean z, civ0 civ0Var, civ0 civ0Var2, long j, String str5, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = civ0Var;
        this.g = civ0Var2;
        this.h = j;
        this.i = str5;
        this.j = z2;
        this.k = new yhv0(j, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof div0)) {
            return false;
        }
        div0 div0Var = (div0) obj;
        return this.a.equals(div0Var.a) && this.b.equals(div0Var.b) && this.c.equals(div0Var.c) && this.d.equals(div0Var.d) && this.e == div0Var.e && this.f.equals(div0Var.f) && this.g.equals(div0Var.g) && this.h == div0Var.h && this.i.equals(div0Var.i) && this.j == div0Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + cy30.d(cy30.f((this.g.hashCode() + ((this.f.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31, this.h, 31), 31, this.i);
    }
}
