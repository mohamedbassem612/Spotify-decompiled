package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i2x {
    public final String a;
    public final String b;
    public final String c;
    public final String d = "";
    public final ijj1 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final boolean j;

    public i2x(String str, String str2, String str3, ijj1 ijj1Var, boolean z, boolean z2, boolean z3, long j, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.e = ijj1Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = j;
        this.j = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2x)) {
            return false;
        }
        i2x i2xVar = (i2x) obj;
        return u890.j(this.a, i2xVar.a) && u890.j(this.b, i2xVar.b) && this.c.equals(i2xVar.c) && this.d.equals(i2xVar.d) && this.e.equals(i2xVar.e) && this.f == i2xVar.f && this.g == i2xVar.g && this.h == i2xVar.h && this.i == i2xVar.i && this.j == i2xVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + cy30.f(xcg1.g(xcg1.g(xcg1.g((this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), this.i, 31);
    }
}
