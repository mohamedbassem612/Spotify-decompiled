package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s3t0 {
    public final String a;
    public final String b;
    public final String c;
    public final clj1 d;
    public final dq70 e;
    public final String f;
    public final String g;
    public final Integer h;
    public final String i;
    public final boolean j;
    public final dq70 k;

    public s3t0(String str, String str2, String str3, clj1 clj1Var, dq70 dq70Var, String str4, String str5, Integer num, String str6, boolean z, dq70 dq70Var2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = clj1Var;
        this.e = dq70Var;
        this.f = str4;
        this.g = str5;
        this.h = num;
        this.i = str6;
        this.j = z;
        this.k = dq70Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3t0)) {
            return false;
        }
        s3t0 s3t0Var = (s3t0) obj;
        return this.a.equals(s3t0Var.a) && this.b.equals(s3t0Var.b) && this.c.equals(s3t0Var.c) && this.d.equals(s3t0Var.d) && this.e.equals(s3t0Var.e) && this.f.equals(s3t0Var.f) && this.g.equals(s3t0Var.g) && this.h.equals(s3t0Var.h) && this.i.equals(s3t0Var.i) && this.j == s3t0Var.j && u890.j(this.k, s3t0Var.k);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(pze0.e(cy30.d(cy30.d((this.e.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        dq70 dq70Var = this.k;
        return iG + (dq70Var == null ? 0 : dq70Var.hashCode());
    }
}
