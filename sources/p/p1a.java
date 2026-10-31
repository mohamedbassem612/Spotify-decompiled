package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p1a extends q1a {
    public final h1a a;

    public p1a(h1a h1aVar) {
        this.a = h1aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1a) && u890.j(this.a, ((p1a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
