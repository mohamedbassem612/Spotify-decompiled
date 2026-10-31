package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eqk1 implements gqk1 {
    public final long a;

    public eqk1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqk1) && this.a == ((eqk1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
