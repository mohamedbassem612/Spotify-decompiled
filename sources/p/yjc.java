package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yjc extends t3k1 {
    public final a5j0 b;

    public yjc(a5j0 a5j0Var) {
        this.b = a5j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yjc) && this.b.equals(((yjc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
