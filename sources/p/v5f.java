package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v5f implements r6f {
    public final m5f a;

    public v5f(m5f m5fVar) {
        this.a = m5fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5f) && this.a == ((v5f) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
