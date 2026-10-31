package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iy90 {
    public final hy90 a;
    public final ay90 b;

    public iy90(hy90 hy90Var, ay90 ay90Var) {
        this.a = hy90Var;
        this.b = ay90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy90)) {
            return false;
        }
        iy90 iy90Var = (iy90) obj;
        return this.a.equals(iy90Var.a) && u890.j(this.b, iy90Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ay90 ay90Var = this.b;
        return iHashCode + (ay90Var == null ? 0 : ay90Var.hashCode());
    }
}
