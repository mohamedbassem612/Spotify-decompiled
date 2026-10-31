package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tta1 {
    public final uta1 a;
    public final sta1 b;

    public tta1(uta1 uta1Var, sta1 sta1Var) {
        this.a = uta1Var;
        this.b = sta1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tta1)) {
            return false;
        }
        tta1 tta1Var = (tta1) obj;
        return this.a.equals(tta1Var.a) && u890.j(this.b, tta1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        sta1 sta1Var = this.b;
        return iHashCode + (sta1Var == null ? 0 : sta1Var.hashCode());
    }
}
