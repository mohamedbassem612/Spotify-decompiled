package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class avb extends lvx {
    public final t7q0 d;
    public final boolean e;

    public avb(t7q0 t7q0Var, boolean z) {
        this.d = t7q0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avb)) {
            return false;
        }
        avb avbVar = (avb) obj;
        return u890.j(this.d, avbVar.d) && this.e == avbVar.e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(true) * 31;
        t7q0 t7q0Var = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (t7q0Var == null ? 0 : t7q0Var.hashCode())) * 31);
    }
}
