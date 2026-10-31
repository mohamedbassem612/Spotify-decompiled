package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uar0 extends x2s {
    public final var0 b;

    public uar0(var0 var0Var) {
        super(zj20.S0);
        this.b = var0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uar0) && u890.j(this.b, ((uar0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
