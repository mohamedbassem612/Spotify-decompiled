package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wgd {
    public final uqo a;

    public wgd(uqo uqoVar) {
        this.a = uqoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wgd) && this.a.equals(((wgd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
