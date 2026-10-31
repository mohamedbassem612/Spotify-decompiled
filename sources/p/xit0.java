package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xit0 extends ljt0 {
    public final long a;

    public xit0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xit0) && this.a == ((xit0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
