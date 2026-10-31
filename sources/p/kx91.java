package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kx91 {
    public final jx91 a;
    public final ix91 b;

    public kx91(jx91 jx91Var, ix91 ix91Var) {
        this.a = jx91Var;
        this.b = ix91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx91)) {
            return false;
        }
        kx91 kx91Var = (kx91) obj;
        return u890.j(this.a, kx91Var.a) && u890.j(this.b, kx91Var.b);
    }

    public final int hashCode() {
        return (((Boolean.hashCode(true) * 31) + (this.a == null ? 0 : -1534415360)) * 31) + (this.b != null ? 1620797559 : 0);
    }
}
