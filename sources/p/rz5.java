package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rz5 {
    public final String a;
    public final boolean b;
    public final fz5 c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final int h;

    public rz5(String str, boolean z, fz5 fz5Var, boolean z2, String str2, boolean z3, boolean z4, int i) {
        this.a = str;
        this.b = z;
        this.c = fz5Var;
        this.d = z2;
        this.e = str2;
        this.f = z3;
        this.g = z4;
        this.h = i;
    }

    public static rz5 a(rz5 rz5Var, String str, boolean z, fz5 fz5Var, String str2, boolean z2, boolean z3, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = rz5Var.a;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            z = rz5Var.b;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            fz5Var = rz5Var.c;
        }
        fz5 fz5Var2 = fz5Var;
        boolean z5 = (i2 & 8) != 0 ? rz5Var.d : true;
        if ((i2 & 16) != 0) {
            str2 = rz5Var.e;
        }
        String str4 = str2;
        if ((i2 & 32) != 0) {
            z2 = rz5Var.f;
        }
        boolean z6 = z2;
        if ((i2 & 64) != 0) {
            z3 = rz5Var.g;
        }
        boolean z7 = z3;
        int i3 = (i2 & 128) != 0 ? rz5Var.h : i;
        rz5Var.getClass();
        return new rz5(str3, z4, fz5Var2, z5, str4, z6, z7, i3);
    }

    public final boolean b() {
        return c() && this.h == 1;
    }

    public final boolean c() {
        return (this.c == null || f() || this.d) ? false : true;
    }

    public final boolean d() {
        return c() && this.h == 2;
    }

    public final boolean e() {
        return this.a.length() == 4 && g() && this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz5)) {
            return false;
        }
        rz5 rz5Var = (rz5) obj;
        return u890.j(this.a, rz5Var.a) && this.b == rz5Var.b && this.c == rz5Var.c && this.d == rz5Var.d && u890.j(this.e, rz5Var.e) && this.f == rz5Var.f && this.g == rz5Var.g && this.h == rz5Var.h;
    }

    public final boolean f() {
        return this.b || this.g;
    }

    public final boolean g() {
        return (f() || this.d || this.c != null) ? false : true;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        fz5 fz5Var = this.c;
        int iG2 = xcg1.g((iG + (fz5Var == null ? 0 : fz5Var.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return l1d.C(this.h) + xcg1.g(xcg1.g((iG2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public /* synthetic */ rz5() {
        this("", false, null, false, null, false, false, 1);
    }
}
