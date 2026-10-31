package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vgb1 extends wgb1 {
    public final int a;
    public final w8d1 b;

    public vgb1(int i, w8d1 w8d1Var) {
        this.a = i;
        this.b = w8d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgb1)) {
            return false;
        }
        vgb1 vgb1Var = (vgb1) obj;
        return this.a == vgb1Var.a && this.b.equals(vgb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
