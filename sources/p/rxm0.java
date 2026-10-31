package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rxm0 implements vxm0 {
    public final tka0 a;
    public final zu30 b;

    public rxm0(tka0 tka0Var, zu30 zu30Var) {
        this.a = tka0Var;
        this.b = zu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxm0)) {
            return false;
        }
        rxm0 rxm0Var = (rxm0) obj;
        return u890.j(this.a, rxm0Var.a) && u890.j(this.b, rxm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
