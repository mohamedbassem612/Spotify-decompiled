package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jan implements lan {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public jan(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jan)) {
            return false;
        }
        jan janVar = (jan) obj;
        return this.a == janVar.a && this.b == janVar.b && this.c == janVar.c && this.d == janVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
