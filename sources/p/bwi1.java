package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bwi1 extends nyo1 {
    public final ywi1 c;

    public bwi1(ywi1 ywi1Var) {
        this.c = ywi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwi1) && this.c.equals(((bwi1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
