package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dmu0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final fmu0 i;
    public final boolean j;

    public dmu0(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, boolean z4, fmu0 fmu0Var, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = z4;
        this.i = fmu0Var;
        this.j = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmu0)) {
            return false;
        }
        dmu0 dmu0Var = (dmu0) obj;
        return u890.j(this.a, dmu0Var.a) && this.b == dmu0Var.b && this.c == dmu0Var.c && this.d == dmu0Var.d && u890.j(this.e, dmu0Var.e) && u890.j(this.f, dmu0Var.f) && u890.j(this.g, dmu0Var.g) && this.h == dmu0Var.h && this.i.equals(dmu0Var.i) && this.j == dmu0Var.j;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + xcg1.g(cy30.d(cy30.d((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h)) * 31);
    }
}
