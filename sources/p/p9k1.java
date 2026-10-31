package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p9k1 extends d7p1 {
    public final hia1 c;

    public p9k1(hia1 hia1Var) {
        this.c = hia1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9k1) && this.c.equals(((p9k1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
