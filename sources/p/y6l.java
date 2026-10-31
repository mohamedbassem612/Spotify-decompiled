package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y6l extends d7l {
    public final hry0 a;

    public y6l(hry0 hry0Var) {
        this.a = hry0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6l) && this.a.equals(((y6l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
