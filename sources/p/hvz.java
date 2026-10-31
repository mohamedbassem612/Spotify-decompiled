package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hvz {
    public final double a;
    public final int b;

    public hvz(double d, int i) {
        this.a = d;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvz)) {
            return false;
        }
        hvz hvzVar = (hvz) obj;
        return Double.compare(this.a, hvzVar.a) == 0 && this.b == hvzVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Double.hashCode(this.a) * 31);
    }
}
