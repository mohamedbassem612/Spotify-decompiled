package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ejt0 extends ljt0 {
    public final b8z a;

    public ejt0(b8z b8zVar) {
        this.a = b8zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejt0) && this.a.equals(((ejt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
