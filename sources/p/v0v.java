package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v0v {
    public final p0v a;

    public v0v(p0v p0vVar) {
        this.a = p0vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0v) && u890.j(this.a, ((v0v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
