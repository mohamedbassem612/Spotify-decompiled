package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jvv0 {
    public final jwv0 a;
    public final int b;

    public jvv0(jwv0 jwv0Var, int i) {
        this.a = jwv0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvv0)) {
            return false;
        }
        jvv0 jvv0Var = (jvv0) obj;
        return this.a.equals(jvv0Var.a) && this.b == jvv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
