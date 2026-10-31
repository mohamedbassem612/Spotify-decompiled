package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y581 {
    public final b681 a;

    public y581(b681 b681Var) {
        this.a = b681Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y581) && this.a.equals(((y581) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
