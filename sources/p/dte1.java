package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dte1 implements dhz, yue1 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final ygz f;

    public dte1(String str, int i, int i2, boolean z, int i3, ygz ygzVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.f = ygzVar;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dte1)) {
            return false;
        }
        dte1 dte1Var = (dte1) obj;
        return this.a.equals(dte1Var.a) && this.b == dte1Var.b && this.c == dte1Var.c && this.d == dte1Var.d && this.e == dte1Var.e && this.f.equals(dte1Var.f);
    }

    public final int g() {
        return this.e;
    }

    public final String getId() {
        return this.a;
    }

    public final boolean h() {
        return this.d;
    }

    public final int hashCode() {
        return this.f.hashCode() + ab80.k(this.e, xcg1.g(kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31);
    }

    public final ygz j() {
        return this.f;
    }
}
