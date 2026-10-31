package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ydf implements bef {
    public final h5f a;

    public ydf(h5f h5fVar) {
        this.a = h5fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ydf) && this.a == ((ydf) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
