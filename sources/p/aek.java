package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aek {
    public final long a;

    public aek(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aek) && this.a == ((aek) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
