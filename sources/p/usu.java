package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class usu implements btu {
    public final p0v a;

    public usu(p0v p0vVar) {
        this.a = p0vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usu) && this.a.equals(((usu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
