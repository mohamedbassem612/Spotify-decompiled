package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bfq0 implements ffq0 {
    public final gfq0 a;

    public bfq0(gfq0 gfq0Var) {
        this.a = gfq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfq0) && this.a.equals(((bfq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
