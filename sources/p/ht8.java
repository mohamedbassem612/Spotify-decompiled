package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ht8 extends czo1 {
    public final String c;

    public ht8(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ht8) && this.c.equals(((ht8) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
