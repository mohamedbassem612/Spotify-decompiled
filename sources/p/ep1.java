package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ep1 implements cq1 {
    public final long a;

    public ep1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep1) && this.a == ((ep1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
