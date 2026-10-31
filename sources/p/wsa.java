package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wsa extends fsa {
    public final j331 a;

    public wsa(j331 j331Var) {
        this.a = j331Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wsa) && this.a.equals(((wsa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
