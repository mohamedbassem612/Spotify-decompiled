package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hgf0 extends igf0 {
    public final gpf0 a;

    public hgf0(gpf0 gpf0Var) {
        this.a = gpf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgf0) && this.a.equals(((hgf0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
