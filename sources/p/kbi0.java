package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kbi0 {
    public final t810 a;
    public final sbi0 b;

    public kbi0(t810 t810Var, sbi0 sbi0Var) {
        this.a = t810Var;
        this.b = sbi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbi0)) {
            return false;
        }
        kbi0 kbi0Var = (kbi0) obj;
        return this.a.equals(kbi0Var.a) && u890.j(this.b, kbi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
