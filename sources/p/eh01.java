package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class eh01 {
    public final iix0 a;
    public final zg01 b;

    public eh01(iix0 iix0Var, zg01 zg01Var) {
        this.a = iix0Var;
        this.b = zg01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh01)) {
            return false;
        }
        eh01 eh01Var = (eh01) obj;
        return u890.j(this.a, eh01Var.a) && this.b.equals(eh01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
