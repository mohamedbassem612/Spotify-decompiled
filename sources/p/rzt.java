package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rzt {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;

    public rzt(long j, long j2, long j3, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzt)) {
            return false;
        }
        rzt rztVar = (rzt) obj;
        return this.a == rztVar.a && this.b == rztVar.b && this.c == rztVar.c && this.d == rztVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
