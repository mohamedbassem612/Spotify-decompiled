package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ys90 {
    public final String a;
    public final ct90 b;

    public ys90(String str, ct90 ct90Var) {
        this.a = str;
        this.b = ct90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys90)) {
            return false;
        }
        ys90 ys90Var = (ys90) obj;
        return u890.j(this.a, ys90Var.a) && this.b.equals(ys90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
