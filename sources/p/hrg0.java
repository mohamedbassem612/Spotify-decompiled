package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hrg0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public hrg0(String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrg0)) {
            return false;
        }
        hrg0 hrg0Var = (hrg0) obj;
        return u890.j(this.a, hrg0Var.a) && u890.j(this.b, hrg0Var.b) && this.c == hrg0Var.c && this.d == hrg0Var.d && this.e == hrg0Var.e && this.f == hrg0Var.f && this.g == hrg0Var.g;
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g(kaa0.f(this.d, kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f);
    }
}
