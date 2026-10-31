package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vsm0 implements xsm0 {
    public final long a;
    public final boolean b;

    public vsm0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsm0)) {
            return false;
        }
        vsm0 vsm0Var = (vsm0) obj;
        return this.a == vsm0Var.a && this.b == vsm0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
