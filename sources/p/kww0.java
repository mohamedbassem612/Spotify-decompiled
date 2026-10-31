package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kww0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;
    public final int k;
    public final String l;
    public final String m;
    public final int n;

    public kww0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, int i9, String str3, String str4, int i10, int i11) {
        i = (i11 & 1) != 0 ? 0 : i;
        int i12 = (i11 & 2) != 0 ? 0 : i2;
        int i13 = (i11 & 4) != 0 ? 0 : i3;
        int i14 = (i11 & 8) == 0 ? i4 : 0;
        int i15 = (i11 & 16) != 0 ? -1 : i5;
        int i16 = (i11 & 32) != 0 ? -1 : i6;
        int i17 = (i11 & 64) != 0 ? -1 : i7;
        int i18 = (i11 & 128) != 0 ? -1 : i8;
        String str5 = (i11 & 256) != 0 ? "not_available" : str;
        String str6 = (i11 & 512) != 0 ? "not_available" : str2;
        int i19 = (i11 & 1024) == 0 ? i9 : -1;
        String str7 = (i11 & 2048) != 0 ? "not_available" : str3;
        String str8 = (i11 & 4096) == 0 ? str4 : "not_available";
        this.a = i;
        this.b = i12;
        this.c = i13;
        this.d = i14;
        this.e = i15;
        this.f = i16;
        this.g = i17;
        this.h = i18;
        this.i = str5;
        this.j = str6;
        this.k = i19;
        this.l = str7;
        this.m = str8;
        this.n = i10;
    }

    public final String a() {
        return this.i;
    }

    public final String b() {
        return this.l;
    }

    public final int c() {
        return this.e;
    }

    public final int d() {
        return this.g;
    }

    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kww0)) {
            return false;
        }
        kww0 kww0Var = (kww0) obj;
        return this.a == kww0Var.a && this.b == kww0Var.b && this.c == kww0Var.c && this.d == kww0Var.d && this.e == kww0Var.e && this.f == kww0Var.f && this.g == kww0Var.g && this.h == kww0Var.h && this.i.equals(kww0Var.i) && this.j.equals(kww0Var.j) && this.k == kww0Var.k && this.l.equals(kww0Var.l) && this.m.equals(kww0Var.m) && this.n == kww0Var.n;
    }

    public final int f() {
        return this.c;
    }

    public final int g() {
        return this.k;
    }

    public final int h() {
        return this.f;
    }

    public final int hashCode() {
        return l1d.C(this.n) + cy30.d(cy30.d(kaa0.f(this.k, cy30.d(cy30.d(kaa0.f(this.h, kaa0.f(this.g, kaa0.f(this.f, kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m);
    }

    public final int i() {
        return this.h;
    }

    public final int j() {
        return this.n;
    }

    public final String k() {
        return this.j;
    }

    public final String l() {
        return this.m;
    }

    public final int m() {
        return this.b;
    }

    public final int n() {
        return this.a;
    }
}
