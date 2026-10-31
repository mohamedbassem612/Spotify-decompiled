package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jsc1 {
    public final ksc1 a;
    public final boolean b;

    public jsc1(ksc1 ksc1Var, boolean z) {
        this.a = ksc1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsc1)) {
            return false;
        }
        jsc1 jsc1Var = (jsc1) obj;
        return u890.j(this.a, jsc1Var.a) && this.b == jsc1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
