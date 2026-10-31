package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class miw0 extends oiw0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final long f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final k4m k;
    public final boolean l;

    public miw0(String str, String str2, boolean z, boolean z2, long j, long j2, boolean z3, long j3, boolean z4, boolean z5, k4m k4mVar, boolean z6) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = j2;
        this.g = z3;
        this.h = j3;
        this.i = z4;
        this.j = z5;
        this.k = k4mVar;
        this.l = z6;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof miw0)) {
            return false;
        }
        miw0 miw0Var = (miw0) obj;
        return u890.j(this.a, miw0Var.a) && this.b.equals(miw0Var.b) && this.c == miw0Var.c && this.d == miw0Var.d && this.e == miw0Var.e && this.f == miw0Var.f && this.g == miw0Var.g && this.h == miw0Var.h && this.i == miw0Var.i && this.j == miw0Var.j && this.k == miw0Var.k && this.l == miw0Var.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + p3d1.g(this.k, xcg1.g(xcg1.g(cy30.f(xcg1.g(cy30.f(cy30.f(xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), this.f, 31), 31, this.g), this.h, 31), 31, this.i), 31, this.j), 31);
    }
}
