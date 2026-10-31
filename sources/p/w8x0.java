package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w8x0 extends w361 {
    public final j8x0 c;

    public w8x0(j8x0 j8x0Var) {
        this.c = j8x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8x0) && u890.j(this.c, ((w8x0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
