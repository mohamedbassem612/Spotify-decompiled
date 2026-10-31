package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wp21 extends ebp1 {
    public final long c;
    public final long d;

    public wp21(long j, long j2) {
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp21)) {
            return false;
        }
        wp21 wp21Var = (wp21) obj;
        return this.c == wp21Var.c && this.d == wp21Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + (Long.hashCode(this.c) * 31);
    }
}
