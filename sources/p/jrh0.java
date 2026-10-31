package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jrh0 implements lrh0 {
    public final p8i0 a;
    public final int b;

    public jrh0(p8i0 p8i0Var, int i) {
        this.a = p8i0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrh0)) {
            return false;
        }
        jrh0 jrh0Var = (jrh0) obj;
        return this.a == jrh0Var.a && this.b == jrh0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(200) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
