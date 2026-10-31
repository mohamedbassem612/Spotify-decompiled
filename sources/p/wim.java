package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wim {
    public final vim a;

    public wim(vim vimVar) {
        this.a = vimVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wim) && this.a.equals(((wim) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
