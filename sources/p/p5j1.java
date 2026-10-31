package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p5j1 {
    public final String a;
    public final long b;
    public final boolean c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;

    public p5j1(String str, long j, boolean z, long j2, long j3, String str2, String str3) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = j2;
        this.e = j3;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5j1)) {
            return false;
        }
        p5j1 p5j1Var = (p5j1) obj;
        return this.a.equals(p5j1Var.a) && this.b == p5j1Var.b && this.c == p5j1Var.c && this.d == p5j1Var.d && this.e == p5j1Var.e && this.f.equals(p5j1Var.f) && this.g.equals(p5j1Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.f(cy30.f(xcg1.g(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31), this.e, 31), 31, this.f);
    }
}
