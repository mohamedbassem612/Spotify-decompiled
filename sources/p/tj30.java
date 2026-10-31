package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tj30 {
    public final long a;
    public final long b;
    public final long c;

    public tj30(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj30)) {
            return false;
        }
        tj30 tj30Var = (tj30) obj;
        return this.a == tj30Var.a && this.b == tj30Var.b && this.c == tj30Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
