package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k0u {
    public final double a;
    public final l0l b;

    public k0u(double d, l0l l0lVar) {
        this.a = d;
        this.b = l0lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0u)) {
            return false;
        }
        k0u k0uVar = (k0u) obj;
        return Double.compare(this.a, k0uVar.a) == 0 && u890.j(this.b, k0uVar.b);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.a) * 31;
        l0l l0lVar = this.b;
        return iHashCode + (l0lVar == null ? 0 : l0lVar.hashCode());
    }
}
