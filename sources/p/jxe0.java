package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jxe0 {
    public final zxo1 a;
    public final uxe0 b;

    public jxe0(zxo1 zxo1Var, uxe0 uxe0Var) {
        this.a = zxo1Var;
        this.b = uxe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxe0)) {
            return false;
        }
        jxe0 jxe0Var = (jxe0) obj;
        return this.a.equals(jxe0Var.a) && this.b.equals(jxe0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
