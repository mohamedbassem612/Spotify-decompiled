package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p0n1 extends ern1 {
    public final q9t c;

    public p0n1(q9t q9tVar) {
        this.c = q9tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0n1) && this.c.equals(((p0n1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
