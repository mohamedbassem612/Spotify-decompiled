package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zsm0 implements etm0 {
    public final long a;
    public final boolean b;

    public zsm0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsm0)) {
            return false;
        }
        zsm0 zsm0Var = (zsm0) obj;
        return this.a == zsm0Var.a && this.b == zsm0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
