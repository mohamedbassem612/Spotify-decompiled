package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class psf {
    public final osf a;

    public psf(osf osfVar) {
        this.a = osfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psf) && this.a.equals(((psf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
