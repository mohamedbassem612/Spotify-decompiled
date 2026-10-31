package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ug71 {
    public final ela1 a;
    public final k371 b;

    public ug71(ela1 ela1Var, k371 k371Var) {
        this.a = ela1Var;
        this.b = k371Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug71)) {
            return false;
        }
        ug71 ug71Var = (ug71) obj;
        return this.a.equals(ug71Var.a) && u890.j(this.b, ug71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
