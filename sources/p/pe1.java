package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pe1 {
    public final cxc0 a;
    public final boolean b;

    public pe1(cxc0 cxc0Var, boolean z) {
        this.a = cxc0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe1)) {
            return false;
        }
        pe1 pe1Var = (pe1) obj;
        return u890.j(this.a, pe1Var.a) && this.b == pe1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
