package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ydo extends dm5 {
    public final String k;

    public ydo(String str) {
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ydo) && this.k.equals(((ydo) obj).k);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }
}
