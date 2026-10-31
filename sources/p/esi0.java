package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class esi0 {
    public final long a;
    public final long b;
    public final boolean c;

    public esi0(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esi0)) {
            return false;
        }
        esi0 esi0Var = (esi0) obj;
        return this.a == esi0Var.a && this.b == esi0Var.b && this.c == esi0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
