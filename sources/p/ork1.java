package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ork1 implements qrk1 {
    public final double a;
    public final int b;

    public ork1(double d, int i) {
        this.a = d;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ork1)) {
            return false;
        }
        ork1 ork1Var = (ork1) obj;
        return Double.compare(this.a, ork1Var.a) == 0 && this.b == ork1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Double.hashCode(this.a) * 31);
    }
}
