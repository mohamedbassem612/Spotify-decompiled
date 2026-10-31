package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uyr0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final int j;

    public uyr0(int i, int i2, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = i;
        this.i = z4;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyr0)) {
            return false;
        }
        uyr0 uyr0Var = (uyr0) obj;
        return u890.j(this.a, uyr0Var.a) && u890.j(this.b, uyr0Var.b) && u890.j(this.c, uyr0Var.c) && u890.j(this.d, uyr0Var.d) && this.e == uyr0Var.e && this.f == uyr0Var.f && this.g == uyr0Var.g && this.h == uyr0Var.h && this.i == uyr0Var.i && this.j == uyr0Var.j;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return l1d.C(this.j) + xcg1.g(ab80.k(this.h, xcg1.g(xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i);
    }
}
