package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k5j0 extends m5j0 {
    public final fwi0 a;
    public final int b;

    public k5j0(fwi0 fwi0Var, int i) {
        this.a = fwi0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5j0)) {
            return false;
        }
        k5j0 k5j0Var = (k5j0) obj;
        return this.a.equals(k5j0Var.a) && this.b == k5j0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
