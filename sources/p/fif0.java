package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fif0 implements mjf0 {
    public final int a;
    public final tv80 b;

    public fif0(int i, tv80 tv80Var) {
        this.a = i;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fif0)) {
            return false;
        }
        fif0 fif0Var = (fif0) obj;
        return this.a == fif0Var.a && u890.j(this.b, fif0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
