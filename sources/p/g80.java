package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g80 implements p80 {
    public final wqn0 a;

    public g80(wqn0 wqn0Var) {
        this.a = wqn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g80) && this.a.equals(((g80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
