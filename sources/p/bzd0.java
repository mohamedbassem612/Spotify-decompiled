package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bzd0 {
    public final iud0 a;
    public final Long b;

    public bzd0(iud0 iud0Var, Long l) {
        this.a = iud0Var;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzd0)) {
            return false;
        }
        bzd0 bzd0Var = (bzd0) obj;
        return this.a == bzd0Var.a && u890.j(this.b, bzd0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
