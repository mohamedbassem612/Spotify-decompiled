package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vds0 implements ces0 {
    public final double a;

    public vds0(double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vds0) && Double.compare(this.a, ((vds0) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }
}
