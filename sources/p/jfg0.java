package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jfg0 extends nfg0 {
    public final w5k1 a;
    public final boolean b;

    public jfg0(w5k1 w5k1Var, boolean z) {
        this.a = w5k1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfg0)) {
            return false;
        }
        jfg0 jfg0Var = (jfg0) obj;
        return this.a == jfg0Var.a && this.b == jfg0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
