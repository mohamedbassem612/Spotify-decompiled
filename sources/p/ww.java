package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ww extends hyo1 {
    public final String c;

    public ww(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww) && this.c.equals(((ww) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
