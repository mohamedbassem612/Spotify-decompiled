package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a6r implements b6r {
    public final a8x a;

    public a6r(a8x a8xVar) {
        this.a = a8xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6r) && this.a.equals(((a6r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
