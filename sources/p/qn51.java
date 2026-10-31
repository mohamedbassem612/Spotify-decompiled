package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qn51 implements sn51 {
    public final long a;

    public qn51(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qn51) && this.a == ((qn51) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
