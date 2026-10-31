package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bar0 implements car0 {
    public final nar0 a;

    public bar0(nar0 nar0Var) {
        this.a = nar0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bar0) && u890.j(this.a, ((bar0) obj).a);
    }

    public final int hashCode() {
        nar0 nar0Var = this.a;
        if (nar0Var == null) {
            return 0;
        }
        return nar0Var.hashCode();
    }
}
