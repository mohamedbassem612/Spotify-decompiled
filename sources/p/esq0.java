package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class esq0 implements fsq0 {
    public final haw0 a;

    public esq0(haw0 haw0Var) {
        this.a = haw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof esq0) && this.a.equals(((esq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
