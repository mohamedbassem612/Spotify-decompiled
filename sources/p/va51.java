package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class va51 {
    public final String a;
    public final c380 b;
    public final ai4 c;
    public final int d;
    public final int e;
    public final boolean f;
    public final int g;

    public va51(String str, c380 c380Var, ai4 ai4Var, int i, int i2, boolean z, int i3) {
        this.a = str;
        this.b = c380Var;
        this.c = ai4Var;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = i3;
    }

    public final int a() {
        return this.g;
    }

    public final ai4 b() {
        return this.c;
    }

    public final c380 c() {
        return this.b;
    }

    public final int d() {
        return this.e;
    }

    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va51)) {
            return false;
        }
        va51 va51Var = (va51) obj;
        return this.a.equals(va51Var.a) && u890.j(this.b, va51Var.b) && this.c == va51Var.c && this.d == va51Var.d && this.e == va51Var.e && this.f == va51Var.f && this.g == va51Var.g;
    }

    public final String f() {
        return this.a;
    }

    public final boolean g() {
        return this.f;
    }

    public final int hashCode() {
        int iG = xcg1.g(kaa0.f(this.e, ab80.k(this.d, (this.c.hashCode() + kk0.f(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31), 31, this.f);
        int i = this.g;
        return iG + (i == 0 ? 0 : l1d.C(i));
    }
}
