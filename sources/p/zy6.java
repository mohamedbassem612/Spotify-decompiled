package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zy6 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final String k;
    public final String l;
    public final String m;

    public zy6(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = i;
        this.k = str7;
        this.l = str8;
        this.m = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy6)) {
            return false;
        }
        zy6 zy6Var = (zy6) obj;
        return this.a.equals(zy6Var.a) && this.b == zy6Var.b && this.c == zy6Var.c && this.d == zy6Var.d && this.e.equals(zy6Var.e) && this.f.equals(zy6Var.f) && this.g.equals(zy6Var.g) && this.h.equals(zy6Var.h) && this.i.equals(zy6Var.i) && this.j == zy6Var.j && this.k.equals(zy6Var.k) && this.l.equals(zy6Var.l) && this.m.equals(zy6Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + cy30.d(cy30.d(kaa0.f(this.j, cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31, this.k), 31, this.l);
    }
}
