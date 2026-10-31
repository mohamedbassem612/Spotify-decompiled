package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b8a extends d8a {
    public final h5a a;

    public b8a(h5a h5aVar) {
        this.a = h5aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b8a) && this.a.equals(((b8a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
