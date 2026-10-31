package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k6h1 {
    public final l7h1 a;

    public k6h1(l7h1 l7h1Var) {
        this.a = l7h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k6h1) && u890.j(this.a, ((k6h1) obj).a);
    }

    public final int hashCode() {
        return this.a.e.hashCode();
    }

    public final String toString() {
        return "UbiDwellTimeImpressionPartial(impressionEvent=" + this.a + ')';
    }
}
