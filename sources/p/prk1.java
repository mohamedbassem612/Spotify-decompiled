package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class prk1 implements qrk1 {
    public final double a;
    public final boolean b;

    public prk1(double d, boolean z) {
        this.a = d;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prk1)) {
            return false;
        }
        prk1 prk1Var = (prk1) obj;
        return Double.compare(this.a, prk1Var.a) == 0 && this.b == prk1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }
}
