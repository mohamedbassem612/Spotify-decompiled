package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b1f0 extends upf {
    public final long d;
    public final boolean e;

    public b1f0(long j, boolean z) {
        this.d = j;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1f0)) {
            return false;
        }
        b1f0 b1f0Var = (b1f0) obj;
        return this.d == b1f0Var.d && this.e == b1f0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (Long.hashCode(this.d) * 31);
    }
}
