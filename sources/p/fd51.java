package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fd51 extends hd51 {
    public final e940 b;

    public fd51(e940 e940Var) {
        this.b = e940Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd51) && u890.j(this.b, ((fd51) obj).b);
    }

    public final int hashCode() {
        e940 e940Var = this.b;
        if (e940Var == null) {
            return 0;
        }
        return e940Var.hashCode();
    }
}
