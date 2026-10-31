package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lcv implements vcv {
    public final bwo a;

    public lcv(bwo bwoVar) {
        this.a = bwoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lcv) && this.a.equals(((lcv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
