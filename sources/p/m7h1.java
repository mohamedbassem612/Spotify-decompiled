package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m7h1 {
    public final z6h1 a;

    public m7h1(z6h1 z6h1Var) {
        this.a = z6h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7h1) && this.a.equals(((m7h1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UbiImpressionEventIdentity(path=" + this.a + ')';
    }
}
