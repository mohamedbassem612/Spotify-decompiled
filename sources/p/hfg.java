package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hfg extends ifg {
    public final cyp0 a;

    public hfg(cyp0 cyp0Var) {
        this.a = cyp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hfg) && this.a.equals(((hfg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
