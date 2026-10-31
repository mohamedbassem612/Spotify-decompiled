package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xtk1 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final h06 f;
    public final String g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final String k;
    public final String l;

    public xtk1(String str, float f, float f2, float f3, int i, h06 h06Var, String str2, boolean z, String str3, boolean z2, String str4, String str5) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = i;
        this.f = h06Var;
        this.g = str2;
        this.h = z;
        this.i = str3;
        this.j = z2;
        this.k = str4;
        this.l = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtk1)) {
            return false;
        }
        xtk1 xtk1Var = (xtk1) obj;
        return u890.j(this.a, xtk1Var.a) && Float.compare(this.b, xtk1Var.b) == 0 && Float.compare(this.c, xtk1Var.c) == 0 && Float.compare(this.d, xtk1Var.d) == 0 && this.e == xtk1Var.e && this.f == xtk1Var.f && this.g.equals(xtk1Var.g) && this.h == xtk1Var.h && u890.j(this.i, xtk1Var.i) && this.j == xtk1Var.j && u890.j(this.k, xtk1Var.k) && u890.j(this.l, xtk1Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + cy30.d(xcg1.g(cy30.d(xcg1.g(cy30.d((this.f.hashCode() + kaa0.f(this.e, x0d.f(x0d.f(x0d.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
