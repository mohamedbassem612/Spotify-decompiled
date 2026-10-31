package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rn51 implements sn51 {
    public final long a;

    public rn51(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rn51) && this.a == ((rn51) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
