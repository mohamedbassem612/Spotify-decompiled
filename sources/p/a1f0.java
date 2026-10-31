package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a1f0 extends upf {
    public final l3f0 d;
    public final bk8 e;

    public a1f0(l3f0 l3f0Var, bk8 bk8Var) {
        this.d = l3f0Var;
        this.e = bk8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1f0)) {
            return false;
        }
        a1f0 a1f0Var = (a1f0) obj;
        return u890.j(this.d, a1f0Var.d) && this.e == a1f0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
