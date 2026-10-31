package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t830 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final say h;

    public t830(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, say sayVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = str5;
        this.h = sayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t830) {
            t830 t830Var = (t830) obj;
            return u890.j(this.a, t830Var.a) && u890.j(this.b, t830Var.b) && this.c.equals(t830Var.c) && this.d.equals(t830Var.d) && this.e == t830Var.e && this.f == t830Var.f && this.g.equals(t830Var.g) && this.h == t830Var.h;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + cy30.d(xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
