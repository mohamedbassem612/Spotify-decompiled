package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gz60 implements oz60 {
    public final fq0 a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Float h;
    public final Float i;

    public gz60(fq0 fq0Var, String str, String str2, int i, int i2, int i3, int i4, Float f, Float f2) {
        this.a = fq0Var;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = f;
        this.i = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz60)) {
            return false;
        }
        gz60 gz60Var = (gz60) obj;
        return this.a.equals(gz60Var.a) && u890.j(this.b, gz60Var.b) && this.c.equals(gz60Var.c) && this.d == gz60Var.d && this.e == gz60Var.e && this.f == gz60Var.f && this.g == gz60Var.g && u890.j(this.h, gz60Var.h) && u890.j(this.i, gz60Var.i);
    }

    public final int hashCode() {
        int iK = ab80.k(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        int i = this.e;
        int iK2 = ab80.k(this.g, ab80.k(this.f, (iK + (i == 0 ? 0 : l1d.C(i))) * 31, 31), 31);
        Float f = this.h;
        int iHashCode = (iK2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.i;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }
}
