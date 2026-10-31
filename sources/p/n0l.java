package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n0l extends p0l {
    public final c7l a;

    public n0l(c7l c7lVar) {
        this.a = c7lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0l) && this.a.equals(((n0l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
