package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a0s0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public a0s0(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = z2;
        this.h = z3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final boolean d() {
        return this.g;
    }

    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0s0)) {
            return false;
        }
        a0s0 a0s0Var = (a0s0) obj;
        return u890.j(this.a, a0s0Var.a) && this.b.equals(a0s0Var.b) && u890.j(this.c, a0s0Var.c) && u890.j(this.d, a0s0Var.d) && this.e == a0s0Var.e && u890.j(this.f, a0s0Var.f) && this.g == a0s0Var.g && this.h == a0s0Var.h;
    }

    public final boolean f() {
        return this.h;
    }

    public final boolean g() {
        return this.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.h) + xcg1.g(cy30.d(xcg1.g((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }
}
