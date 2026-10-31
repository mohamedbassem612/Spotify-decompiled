package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u240 implements x240 {
    public final long a;

    public u240(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u240) && this.a == ((u240) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
