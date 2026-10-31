package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jck0 implements qck0 {
    public final b8w0 a;
    public final int b;

    public jck0(b8w0 b8w0Var, int i) {
        this.a = b8w0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jck0)) {
            return false;
        }
        jck0 jck0Var = (jck0) obj;
        return this.a == jck0Var.a && this.b == jck0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
