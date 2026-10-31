package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f7g implements q7g {
    public final g250 a;

    public f7g(g250 g250Var) {
        this.a = g250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7g) && this.a.equals(((f7g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
