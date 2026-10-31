package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ism0 {
    public final long a;

    public ism0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ism0) && this.a == ((ism0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Long.hashCode(this.a) * 31);
    }
}
