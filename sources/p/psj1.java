package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class psj1 {
    public final long a;
    public final int b;

    public psj1(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psj1)) {
            return false;
        }
        psj1 psj1Var = (psj1) obj;
        return this.a == psj1Var.a && this.b == psj1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
