package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mk9 {
    public final boolean a;
    public final hpc1 b;

    public mk9(boolean z, hpc1 hpc1Var) {
        this.a = z;
        this.b = hpc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk9)) {
            return false;
        }
        mk9 mk9Var = (mk9) obj;
        return this.a == mk9Var.a && u890.j(this.b, mk9Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        hpc1 hpc1Var = this.b;
        return iHashCode + (hpc1Var == null ? 0 : hpc1Var.hashCode());
    }
}
