package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a9x0 extends w361 {
    public final a530 c;

    public a9x0(a530 a530Var) {
        this.c = a530Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9x0) && this.c.equals(((a9x0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
