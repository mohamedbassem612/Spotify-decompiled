package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lmw0 implements mmw0 {
    public final long a;

    public lmw0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmw0) && this.a == ((lmw0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
