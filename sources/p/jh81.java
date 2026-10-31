package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jh81 {
    public final n8h1 a;
    public final vu30 b;

    public jh81(n8h1 n8h1Var, vu30 vu30Var) {
        this.a = n8h1Var;
        this.b = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh81)) {
            return false;
        }
        jh81 jh81Var = (jh81) obj;
        return this.a.equals(jh81Var.a) && this.b.equals(jh81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
