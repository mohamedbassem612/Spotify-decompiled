package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dqk1 implements gqk1 {
    public final long a;

    public dqk1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqk1) && this.a == ((dqk1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
