package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pa7 implements za7 {
    public final i a;

    public pa7(i iVar) {
        this.a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pa7) && this.a.equals(((pa7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
