package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s720 extends t720 {
    public final ldl0 a;
    public final int b;

    public s720(ldl0 ldl0Var, int i) {
        this.a = ldl0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s720)) {
            return false;
        }
        s720 s720Var = (s720) obj;
        return this.a == s720Var.a && this.b == s720Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
