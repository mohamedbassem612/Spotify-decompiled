package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fwb0 {
    public final ewb0 a;
    public final boolean b;

    public fwb0(ewb0 ewb0Var, boolean z) {
        this.a = ewb0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwb0)) {
            return false;
        }
        fwb0 fwb0Var = (fwb0) obj;
        return this.a.equals(fwb0Var.a) && this.b == fwb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
