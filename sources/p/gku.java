package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gku implements khm0 {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final jyv0 e;
    public final boolean f;
    public final boolean g;

    public gku(long j, long j2, boolean z, boolean z2, jyv0 jyv0Var, boolean z3, boolean z4) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = z2;
        this.e = jyv0Var;
        this.f = z3;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gku)) {
            return false;
        }
        gku gkuVar = (gku) obj;
        return this.a == gkuVar.a && this.b == gkuVar.b && this.c == gkuVar.c && this.d == gkuVar.d && this.e.equals(gkuVar.e) && this.f == gkuVar.f && this.g == gkuVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(f4i1.b(xcg1.g(xcg1.g(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), 31, this.c), 31, this.d), 31, this.e.a), 31, this.f);
    }
}
