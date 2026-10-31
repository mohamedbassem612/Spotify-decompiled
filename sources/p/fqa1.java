package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fqa1 implements gqa1 {
    public final int a;
    public final int b;

    public fqa1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqa1)) {
            return false;
        }
        fqa1 fqa1Var = (fqa1) obj;
        return this.a == fqa1Var.a && this.b == fqa1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
