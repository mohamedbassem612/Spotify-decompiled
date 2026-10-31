package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oq31 implements qq31 {
    public final long a;

    public oq31(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq31) && this.a == ((oq31) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
