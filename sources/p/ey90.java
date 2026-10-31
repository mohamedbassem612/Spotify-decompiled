package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ey90 implements gy90 {
    public final vo90 a;
    public final int b;

    public ey90(vo90 vo90Var, int i) {
        this.a = vo90Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey90)) {
            return false;
        }
        ey90 ey90Var = (ey90) obj;
        return u890.j(this.a, ey90Var.a) && this.b == ey90Var.b;
    }

    public final int hashCode() {
        vo90 vo90Var = this.a;
        int iHashCode = (vo90Var == null ? 0 : vo90Var.hashCode()) * 31;
        int i = this.b;
        return iHashCode + (i != 0 ? l1d.C(i) : 0);
    }
}
