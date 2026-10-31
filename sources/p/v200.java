package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v200 implements y600 {
    public final double a;

    public v200(double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v200) && Double.compare(this.a, ((v200) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }
}
