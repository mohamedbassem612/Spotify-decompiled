package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fzr0 implements gzr0 {
    public final c380 a;
    public final int b;

    public fzr0(int i, c380 c380Var) {
        this.a = c380Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzr0)) {
            return false;
        }
        fzr0 fzr0Var = (fzr0) obj;
        return u890.j(this.a, fzr0Var.a) && this.b == fzr0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
