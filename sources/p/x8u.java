package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x8u extends d9u {
    public final k1o1 a;

    public x8u(k1o1 k1o1Var) {
        this.a = k1o1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8u) && this.a.equals(((x8u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
