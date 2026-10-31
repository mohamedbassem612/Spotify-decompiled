package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kgm {
    public final vim a;

    public kgm(vim vimVar) {
        this.a = vimVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kgm) && this.a.equals(((kgm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
