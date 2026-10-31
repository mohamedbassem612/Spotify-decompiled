package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nnj0 extends snj0 {
    public final fy50 b;
    public final boolean c;

    public nnj0(fy50 fy50Var, boolean z) {
        super(false);
        this.b = fy50Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnj0)) {
            return false;
        }
        nnj0 nnj0Var = (nnj0) obj;
        return u890.j(this.b, nnj0Var.b) && this.c == nnj0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
