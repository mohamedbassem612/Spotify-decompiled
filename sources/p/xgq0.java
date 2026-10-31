package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xgq0 {
    public final long a;
    public final int b;

    public xgq0(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final long a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgq0)) {
            return false;
        }
        xgq0 xgq0Var = (xgq0) obj;
        return this.a == xgq0Var.a && this.b == xgq0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
