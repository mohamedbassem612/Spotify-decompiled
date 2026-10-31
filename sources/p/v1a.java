package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v1a extends z1a {
    public final o1v a;

    public v1a(o1v o1vVar) {
        this.a = o1vVar;
    }

    public final o1v b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1a) && this.a == ((v1a) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
