package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s5c1 implements t5c1 {
    public final jxc1 a;
    public final int b;

    public s5c1(jxc1 jxc1Var, int i) {
        this.a = jxc1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5c1)) {
            return false;
        }
        s5c1 s5c1Var = (s5c1) obj;
        return u890.j(this.a, s5c1Var.a) && this.b == s5c1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
