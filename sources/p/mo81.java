package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mo81 extends s9p1 {
    public final xc40 c;

    public mo81(xc40 xc40Var) {
        this.c = xc40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mo81) && this.c.equals(((mo81) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
