package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nt1 implements pt1 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;

    public nt1(String str, String str2, String str3, boolean z, boolean z2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = i2;
    }

    @Override // p.pt1
    public final String a() {
        return this.c;
    }

    @Override // p.pt1
    public final boolean b() {
        return this.e;
    }

    public final int c() {
        return this.f;
    }

    public final int d() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt1)) {
            return false;
        }
        nt1 nt1Var = (nt1) obj;
        return this.a.equals(nt1Var.a) && this.b.equals(nt1Var.b) && this.c.equals(nt1Var.c) && this.d == nt1Var.d && this.e == nt1Var.e && this.f == nt1Var.f && this.g == nt1Var.g;
    }

    @Override // p.pt1
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + kaa0.f(this.f, xcg1.g(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }
}
