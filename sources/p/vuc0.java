package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vuc0 implements cvc0 {
    public final int a;
    public final xuc0 b;

    public vuc0(int i, xuc0 xuc0Var) {
        this.a = i;
        this.b = xuc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuc0)) {
            return false;
        }
        vuc0 vuc0Var = (vuc0) obj;
        return this.a == vuc0Var.a && this.b.equals(vuc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
