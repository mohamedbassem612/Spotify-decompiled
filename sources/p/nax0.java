package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nax0 extends yax0 {
    public final obx0 a;
    public final int b;

    public nax0(obx0 obx0Var, int i) {
        this.a = obx0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nax0)) {
            return false;
        }
        nax0 nax0Var = (nax0) obj;
        return this.a.equals(nax0Var.a) && this.b == nax0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
