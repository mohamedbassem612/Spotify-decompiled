package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hdu implements idu {
    public final String a;

    public hdu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hdu) && this.a.equals(((hdu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
