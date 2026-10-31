package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class idh0 {
    public final xch0 a;
    public final zfc1 b;

    public idh0(xch0 xch0Var, zfc1 zfc1Var) {
        this.a = xch0Var;
        this.b = zfc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idh0)) {
            return false;
        }
        idh0 idh0Var = (idh0) obj;
        return this.a.equals(idh0Var.a) && this.b == idh0Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zfc1 zfc1Var = this.b;
        return iHashCode + (zfc1Var == null ? 0 : zfc1Var.hashCode());
    }
}
