package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iix implements mix {
    public final nix a;

    public iix(nix nixVar) {
        this.a = nixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iix) && this.a.equals(((iix) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
