package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jix implements mix {
    public final nix a;

    public jix(nix nixVar) {
        this.a = nixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jix) && this.a.equals(((jix) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
