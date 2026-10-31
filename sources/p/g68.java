package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g68 extends kuo1 {
    public final ne2 b;

    public g68(ne2 ne2Var) {
        this.b = ne2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g68) && this.b.equals(((g68) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
