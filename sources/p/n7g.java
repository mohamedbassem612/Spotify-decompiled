package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n7g implements q7g {
    public final h3b1 a;

    public n7g(h3b1 h3b1Var) {
        this.a = h3b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n7g) && this.a == ((n7g) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
