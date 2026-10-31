package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u4i0 implements v4i0 {
    public final long a;
    public final long b;
    public final boolean c;

    public u4i0(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4i0)) {
            return false;
        }
        u4i0 u4i0Var = (u4i0) obj;
        return this.a == u4i0Var.a && this.b == u4i0Var.b && this.c == u4i0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
