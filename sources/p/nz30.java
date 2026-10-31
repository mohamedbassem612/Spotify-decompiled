package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nz30 extends dug {
    public final String c;

    public nz30(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nz30) && this.c.equals(((nz30) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
