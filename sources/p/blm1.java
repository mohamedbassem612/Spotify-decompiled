package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class blm1 implements glm1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final long i;
    public final double j;

    public blm1(String str, String str2, boolean z, boolean z2, String str3, String str4, long j, long j2, long j3, double d) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = str4;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blm1)) {
            return false;
        }
        blm1 blm1Var = (blm1) obj;
        return this.a.equals(blm1Var.a) && this.b.equals(blm1Var.b) && this.c == blm1Var.c && this.d == blm1Var.d && this.e.equals(blm1Var.e) && this.f.equals(blm1Var.f) && this.g == blm1Var.g && this.h == blm1Var.h && this.i == blm1Var.i && Double.compare(this.j, blm1Var.j) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.j) + cy30.f(cy30.f(cy30.f(cy30.d(cy30.d(xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), this.g, 31), this.h, 31), this.i, 31);
    }
}
