package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q9u extends gau {
    public final int a;

    public q9u(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q9u) && this.a == ((q9u) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
