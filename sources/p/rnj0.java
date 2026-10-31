package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rnj0 extends snj0 {
    public final d2k1 b;

    public rnj0(d2k1 d2k1Var) {
        super(false);
        this.b = d2k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rnj0) && u890.j(this.b, ((rnj0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
