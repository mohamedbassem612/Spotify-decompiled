package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k071 implements x071 {
    public final j071 a;

    public k071(j071 j071Var) {
        this.a = j071Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k071) && this.a.equals(((k071) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
