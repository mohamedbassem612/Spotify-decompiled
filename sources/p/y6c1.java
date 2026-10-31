package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y6c1 extends tho1 {
    public final int c;
    public final long d;

    public y6c1(int i, long j) {
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6c1)) {
            return false;
        }
        y6c1 y6c1Var = (y6c1) obj;
        return this.c == y6c1Var.c && this.d == y6c1Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + (Integer.hashCode(this.c) * 31);
    }
}
