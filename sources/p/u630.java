package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u630 {
    public final w630 a;

    public u630(w630 w630Var) {
        this.a = w630Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u630) && this.a.equals(((u630) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
