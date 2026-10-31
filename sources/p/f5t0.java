package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f5t0 {
    public final short a;
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public f5t0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5t0)) {
            return false;
        }
        f5t0 f5t0Var = (f5t0) obj;
        return this.a == f5t0Var.a && this.b == f5t0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
