package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jd5 {
    public final ld5 a;
    public final k3h1 b;

    public jd5(ld5 ld5Var, k3h1 k3h1Var) {
        this.a = ld5Var;
        this.b = k3h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd5)) {
            return false;
        }
        jd5 jd5Var = (jd5) obj;
        return this.a.equals(jd5Var.a) && this.b.equals(jd5Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.b) + ((this.a.hashCode() - 368338282) * 31);
    }
}
