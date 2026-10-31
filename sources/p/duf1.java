package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class duf1 implements euf1 {
    public final long a;

    public duf1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof duf1) && this.a == ((duf1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
