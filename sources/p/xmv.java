package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xmv implements ymv {
    public final ova a;

    public xmv(ova ovaVar) {
        this.a = ovaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmv) && this.a == ((xmv) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
