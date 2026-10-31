package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k1e1 {
    public final a1e1 a;

    public k1e1(a1e1 a1e1Var) {
        this.a = a1e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1e1) && this.a.equals(((k1e1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
