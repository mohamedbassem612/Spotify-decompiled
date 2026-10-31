package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xz21 {
    public final int a;
    public final long b;

    public xz21(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz21)) {
            return false;
        }
        xz21 xz21Var = (xz21) obj;
        return this.a == xz21Var.a && this.b == xz21Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
