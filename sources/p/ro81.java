package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ro81 extends s9p1 {
    public final fjn0 c;

    public ro81(fjn0 fjn0Var) {
        this.c = fjn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ro81) && this.c.equals(((ro81) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
