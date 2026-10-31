package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ott {
    public final double a;
    public final long b;

    public ott(double d, long j) {
        this.a = d;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ott)) {
            return false;
        }
        ott ottVar = (ott) obj;
        return Double.compare(this.a, ottVar.a) == 0 && this.b == ottVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }
}
