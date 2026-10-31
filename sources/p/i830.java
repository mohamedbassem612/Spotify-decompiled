package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i830 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final say i;

    public i830(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, say sayVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str5;
        this.i = sayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i830) {
            i830 i830Var = (i830) obj;
            return u890.j(this.a, i830Var.a) && u890.j(this.b, i830Var.b) && this.c.equals(i830Var.c) && this.d.equals(i830Var.d) && this.e == i830Var.e && this.f == i830Var.f && this.g == i830Var.g && this.h.equals(i830Var.h) && this.i == i830Var.i;
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d(xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
