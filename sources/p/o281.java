package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o281 extends e6p1 {
    public final String c;

    public o281(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o281) && this.c.equals(((o281) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
