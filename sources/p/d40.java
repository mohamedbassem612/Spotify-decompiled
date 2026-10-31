package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d40 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ell f;
    public final long g;
    public final long h;
    public final mgo0 i;

    public d40(String str, String str2, String str3, String str4, String str5, ell ellVar, long j, long j2, mgo0 mgo0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = ellVar;
        this.g = j;
        this.h = j2;
        this.i = mgo0Var;
    }

    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d40)) {
            return false;
        }
        d40 d40Var = (d40) obj;
        return this.a.equals(d40Var.a) && this.b.equals(d40Var.b) && this.c.equals(d40Var.c) && this.d.equals(d40Var.d) && this.e.equals(d40Var.e) && this.f == d40Var.f && this.g == d40Var.g && this.h == d40Var.h && u890.j(this.i, d40Var.i);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f((this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, this.g, 31), this.h, 31);
        mgo0 mgo0Var = this.i;
        return iF + (mgo0Var == null ? 0 : mgo0Var.hashCode());
    }
}
