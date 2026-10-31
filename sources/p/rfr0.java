package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rfr0 {
    public final zob1 a;
    public final boolean b;

    public rfr0(zob1 zob1Var, boolean z) {
        this.a = zob1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfr0)) {
            return false;
        }
        rfr0 rfr0Var = (rfr0) obj;
        return u890.j(this.a, rfr0Var.a) && this.b == rfr0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
