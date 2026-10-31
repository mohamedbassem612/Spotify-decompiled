package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wui1 {
    public final double a;

    public wui1(double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wui1) && Double.compare(this.a, ((wui1) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }
}
