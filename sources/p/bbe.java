package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bbe implements cbe {
    public final p0v a;

    public bbe(p0v p0vVar) {
        this.a = p0vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbe) && this.a.equals(((bbe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
