package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vj91 extends bk91 {
    public final boolean a;
    public final boolean b;

    public vj91(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj91)) {
            return false;
        }
        vj91 vj91Var = (vj91) obj;
        return this.a == vj91Var.a && this.b == vj91Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
