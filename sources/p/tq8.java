package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tq8 {
    public static final tq8 i = new tq8(null, 6, null, false, false, false, false, false);
    public final wq8 a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public tq8(wq8 wq8Var, int i2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = wq8Var;
        this.b = i2;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    public final sq8 a() {
        sq8 sq8Var = new sq8();
        sq8Var.a = this.a;
        sq8Var.b = this.b;
        sq8Var.c = this.c;
        sq8Var.d = this.d;
        sq8Var.e = this.e;
        sq8Var.f = this.f;
        sq8Var.g = this.g;
        sq8Var.h = this.h;
        return sq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq8)) {
            return false;
        }
        tq8 tq8Var = (tq8) obj;
        return u890.j(this.a, tq8Var.a) && this.b == tq8Var.b && u890.j(this.c, tq8Var.c) && this.d == tq8Var.d && this.e == tq8Var.e && this.f == tq8Var.f && this.g == tq8Var.g && this.h == tq8Var.h;
    }

    public final int hashCode() {
        wq8 wq8Var = this.a;
        int iK = ab80.k(this.b, (wq8Var == null ? 0 : wq8Var.hashCode()) * 31, 31);
        String str = this.c;
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g(xcg1.g(xcg1.g((iK + (str != null ? str.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
