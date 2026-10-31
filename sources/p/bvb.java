package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bvb extends lvx {
    public final t7q0 d;
    public final boolean e;

    public bvb(t7q0 t7q0Var, boolean z) {
        this.d = t7q0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvb)) {
            return false;
        }
        bvb bvbVar = (bvb) obj;
        return u890.j(this.d, bvbVar.d) && this.e == bvbVar.e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(true) * 31;
        t7q0 t7q0Var = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (t7q0Var == null ? 0 : t7q0Var.hashCode())) * 31);
    }
}
