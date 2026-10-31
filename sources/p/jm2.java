package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jm2 implements mm2 {
    public final s2j1 a;
    public final int b;

    public jm2(s2j1 s2j1Var, int i) {
        this.a = s2j1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm2)) {
            return false;
        }
        jm2 jm2Var = (jm2) obj;
        return this.a == jm2Var.a && this.b == jm2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
