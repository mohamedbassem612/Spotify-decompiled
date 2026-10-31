package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fh71 extends u1p1 {
    public final k371 c;

    public fh71(k371 k371Var) {
        this.c = k371Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fh71) && u890.j(this.c, ((fh71) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
