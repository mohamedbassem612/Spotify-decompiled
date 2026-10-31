package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lix implements mix {
    public final oix a;

    public lix(oix oixVar) {
        this.a = oixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lix) && this.a.equals(((lix) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
