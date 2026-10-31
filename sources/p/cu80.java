package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cu80 extends j82 {
    public final ldl0 d;
    public final int e;

    public cu80(ldl0 ldl0Var, int i) {
        this.d = ldl0Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu80)) {
            return false;
        }
        cu80 cu80Var = (cu80) obj;
        return this.d == cu80Var.d && this.e == cu80Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}
