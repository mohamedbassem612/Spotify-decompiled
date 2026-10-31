package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uds0 implements ces0 {
    public final double a;

    public uds0(double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uds0) && Double.compare(this.a, ((uds0) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }
}
