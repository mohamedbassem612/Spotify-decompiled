package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j2f0 extends e9k {
    public final int g;

    public j2f0(int i) {
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2f0) && this.g == ((j2f0) obj).g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }
}
