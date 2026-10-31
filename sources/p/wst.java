package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wst implements ctt {
    public final lrt a;

    public wst(lrt lrtVar) {
        this.a = lrtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wst) && this.a.equals(((wst) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
