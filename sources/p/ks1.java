package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ks1 implements bt1 {
    public final long a;

    public ks1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ks1) && this.a == ((ks1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
