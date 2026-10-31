package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g2x {
    public final h290 a;

    public g2x(h290 h290Var) {
        this.a = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2x) && this.a.equals(((g2x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
